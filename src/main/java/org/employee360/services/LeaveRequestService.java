package org.employee360.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.employee360.bo.LeaveRequest;
import org.employee360.bo.LeaveRequestList;
import org.employee360.util.DataBase;

@Path("/leaveRequest")
public class LeaveRequestService {

	public LeaveRequestService() {
		LeaveRequest leaveRequest = new LeaveRequest("1B90", new Date(2018, 3, 7), new Date(2018, 3, 9));
		DataBase.leaveRequestMap.put(leaveRequest.getRequestId(), leaveRequest);
		leaveRequest = new LeaveRequest("1D23", new Date(2018, 3, 1), new Date(2018, 3, 1));
		DataBase.leaveRequestMap.put(leaveRequest.getRequestId(), leaveRequest);
		leaveRequest = new LeaveRequest("1B90", new Date(2018, 2, 5), new Date(2018, 2, 6));
		DataBase.leaveRequestMap.put(leaveRequest.getRequestId(), leaveRequest);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public LeaveRequestList getLeave(@QueryParam("empId") String empId, @QueryParam("reqId") String reqId) {
		List<LeaveRequest> returnLeaveRequestList = new ArrayList<>();
		LeaveRequestList leaveRequestList = new LeaveRequestList();
		if (empId != null) {
			for (LeaveRequest leaveRequest : DataBase.leaveRequestMap.values()) {
				if (leaveRequest.getEmpId().equals(empId)) {
					returnLeaveRequestList.add(leaveRequest);
				}
			}
			leaveRequestList.setLeaveRequestList(returnLeaveRequestList);
			return leaveRequestList;
		} else if (reqId != null) {
			returnLeaveRequestList.add(DataBase.leaveRequestMap.get(Integer.parseInt(reqId)));
			leaveRequestList.setLeaveRequestList(returnLeaveRequestList);
			return leaveRequestList;
		} else {
			leaveRequestList.setLeaveRequestList(new ArrayList<LeaveRequest>(DataBase.leaveRequestMap.values()));
			return leaveRequestList;
		}
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public LeaveRequest addLeaveRequest(LeaveRequest leaveRequest) {
		DataBase.leaveRequestMap.put(leaveRequest.getRequestId(), leaveRequest);
		return DataBase.leaveRequestMap.get(leaveRequest.getRequestId());
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public LeaveRequest updateLeaveRequest(LeaveRequest leaveRequest) {
		DataBase.leaveRequestMap.put(leaveRequest.getRequestId(), leaveRequest);
		return DataBase.leaveRequestMap.get(leaveRequest.getRequestId());
	}

	@DELETE
	@Path("/{reqId}")
	public void deleteEvent(@PathParam("reqId") String reqId) {
		DataBase.leaveRequestMap.remove(Integer.parseInt(reqId));
	}

}

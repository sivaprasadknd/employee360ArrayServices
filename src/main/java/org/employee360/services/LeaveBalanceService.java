package org.employee360.services;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.employee360.bo.LeaveBalance;
import org.employee360.bo.LeaveBalanceList;
import org.employee360.util.DataBase;

@Path("/leaves")
public class LeaveBalanceService {

	public LeaveBalanceService() {
		DataBase.leaveBalanceMap.put("1B90", new LeaveBalance("1B90", 10));
		DataBase.leaveBalanceMap.put("5WJ5", new LeaveBalance("5WJ5", 20));
		DataBase.leaveBalanceMap.put("QTM6", new LeaveBalance("QTM6", 30));
		DataBase.leaveBalanceMap.put("6HR9", new LeaveBalance("6HR9", 40));
		DataBase.leaveBalanceMap.put("1D23", new LeaveBalance("1D23", 50));
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public LeaveBalanceList getLeaves() {

		LeaveBalanceList leaveBalanceList = new LeaveBalanceList();
		leaveBalanceList.setLeaveBalanceList(new ArrayList<LeaveBalance>(DataBase.leaveBalanceMap.values()));
		return leaveBalanceList;
	}

	@GET
	@Path("/{empId}")
	@Produces(MediaType.APPLICATION_JSON)
	public LeaveBalance getLeave(@PathParam("empId") String empId) {
		return DataBase.leaveBalanceMap.get(empId);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public LeaveBalance addLeave(LeaveBalance leaveBalance) {
		DataBase.leaveBalanceMap.put(leaveBalance.getEmpId(), leaveBalance);
		return DataBase.leaveBalanceMap.get(leaveBalance.getEmpId());
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public LeaveBalance updateLeaveBalance(LeaveBalance leaveBalance) {
		DataBase.leaveBalanceMap.put(leaveBalance.getEmpId(), leaveBalance);
		return DataBase.leaveBalanceMap.get(leaveBalance.getEmpId());
	}

}

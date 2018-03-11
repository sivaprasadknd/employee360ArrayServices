package org.employee360.bo;

import java.util.Date;

public class LeaveRequest {
	private Integer requestId;
	private String empId;
	private Date startDate;
	private Date endDate;
	public static Integer reqId = 0;

	public LeaveRequest() {

	}

	public LeaveRequest(String empId, Date startDate, Date endDate) {
		this.requestId = ++reqId;
		this.empId = empId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Integer getRequestId() {
		return requestId;
	}

	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}

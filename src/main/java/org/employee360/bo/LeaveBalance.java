package org.employee360.bo;

public class LeaveBalance {

	private String empId;
	private Integer leaveBalance;
	
	public LeaveBalance() {
		
	}
	
	public LeaveBalance(String empId, Integer leaveBalance) {
		this.empId = empId;
		this.leaveBalance = leaveBalance;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Integer getLeaveBalance() {
		return leaveBalance;
	}

	public void setLeaveBalance(Integer leaveBalance) {
		this.leaveBalance = leaveBalance;
	}

}

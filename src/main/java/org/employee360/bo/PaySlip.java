package org.employee360.bo;

public class PaySlip {

	private String empId;
	private Integer month;
	private String imagePath;
	
	public PaySlip() {
		
	}
	
	public PaySlip(String empId, Integer month, String imagePath) {
		this.empId = empId;
		this.month = month;
		this.imagePath = imagePath;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
}

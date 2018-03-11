package org.employee360.bo;

import java.io.File;

public class Bill {
	private Integer billId;
	private String empId;
	private BillType billType;
	private File Image;
	private static Integer billSeq = 0;
	
	public Bill() {
		
	}

	public Bill( String empId, BillType billType, File image) {
		this.billId = ++billSeq;
		this.empId = empId;
		this.billType = billType;
		Image = image;
	}
	public Integer getBillId() {
		return billId;
	}
	public void setBillId(Integer billId) {
		this.billId = billId;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public BillType getBillType() {
		return billType;
	}
	public void setBillType(BillType billType) {
		this.billType = billType;
	}
	public File getImage() {
		return Image;
	}
	public void setImage(File image) {
		Image = image;
	}
	
}

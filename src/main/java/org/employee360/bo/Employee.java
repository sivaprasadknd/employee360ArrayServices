package org.employee360.bo;

public class Employee {
	private String empId;
	private String password;
	private String name;
	private String role;
	private String professionalExperience;
	private String manager;
	private Boolean isManager;
	private String mobileNumber;
	private String Address;
	
	public Employee() {
		
	}
	
	public Employee(String empId, String password, String name, String role, 
			String professionalExperience, String manager, Boolean isManager, String mobileNumber, String Address) {
		super();
		this.empId = empId;
		this.password = password;
		this.name = name;
		this.role = role;
		this.professionalExperience = professionalExperience;
		this.manager = manager;
		this.isManager = isManager;
		this.mobileNumber = mobileNumber;
		this.Address = Address;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return role;
	}
	public void setQualification(String qualification) {
		this.role = qualification;
	}
	public String getProfessionalExperience() {
		return professionalExperience;
	}
	public void setProfessionalExperience(String professionalExperience) {
		this.professionalExperience = professionalExperience;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public Boolean getIsManager() {
		return isManager;
	}
	public void setIsManager(Boolean isManager) {
		this.isManager = isManager;
	}
	
	

}

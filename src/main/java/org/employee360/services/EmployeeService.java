package org.employee360.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.employee360.bo.Employee;
import org.employee360.bo.EmployeeList;
import org.employee360.util.DataBase;

@Path("/employee")
public class EmployeeService {
	
	public EmployeeService() {
		DataBase.employeMap.put("1B90", new Employee("1B90", "1B90", "Siva Prasad", "Program Analyst", "5 Years", "5WJ5", Boolean.FALSE,"9866027030","Hyd"));
		DataBase.employeMap.put("5WJ5", new Employee("5WJ5", "5WJ5", "Lohith Krishna", "Program Analyst", "5 Years", "5WJ5", Boolean.TRUE,"9866713375", "Orugallu"));
		DataBase.employeMap.put("6HR9", new Employee("6HR9", "6HR9", "Gopi", "Program Analyst", "4 Years", "5WJ5", Boolean.FALSE,"9866768263", "Nandigama"));
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public EmployeeList getEmployees(@QueryParam("empId") String empId) {
		EmployeeList employeeList = new EmployeeList();
		if (empId != null) {
			List<Employee> tempEmployeeList = new ArrayList<>();
			tempEmployeeList.add((DataBase.employeMap.get(empId)));
			employeeList.setEmployeeList(tempEmployeeList);
		} else {
			employeeList.setEmployeeList(new ArrayList<>(DataBase.employeMap.values()));	
		}
		
		return employeeList; 
	}

}

package spring.mvc.InterviewQs.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Employee {

	private String employeename;
	private String department;
	private long employeeId;

	@Autowired
	private Manager manager;
	
	@Autowired
	//@Qualifier(value = "projectLead")
	private TeamLead teamLead;

	public Employee() {
		System.out.println("Employee constructor called");
	}

	/*
	 * @Autowired public Employee(String employeename, String department, long
	 * employeeId, Manager manager) { this.employeename = employeename;
	 * this.department = department; this.employeeId = employeeId; this.manager =
	 * manager; }
	 */

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public void getEmployeeDetails() {
		System.out.println("Employee name :" + getEmployeename());
		System.out.println("Employee Department :" + getDepartment());
		System.out.println("Employee ID :" + getEmployeeId());
		manager.getManagerDetails();
		teamLead.getTeamLeadDetails();
	}

}

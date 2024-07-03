package spring.mvc.InterviewQs.xmlConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String name;
	private int age;
	private String school;
	private int rollNo;

	private Address address;

	public Student() {
		System.out.println("Student constructor called");
	}

	public Student(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName setter called");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge setter called");
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void getStudentdetails() {
		System.out.println("Name :" + this.name);
		System.out.println("Age :" + this.age);
		System.out.println("School :" + this.school);
		System.out.println("RollNo :" + this.rollNo);
		address.getAddress();
	}

}

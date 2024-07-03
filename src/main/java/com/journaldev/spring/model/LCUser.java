package com.journaldev.spring.model;

import javax.validation.constraints.AssertTrue;

import org.hibernate.validator.constraints.NotBlank;

public class LCUser {

	@NotBlank(message = "YourName field should not be empty")
	private String yourName="test";
	@NotBlank(message = "CrushName field should not be empty")
	private String crushName="test2";
	@AssertTrue(message = "Please accept terms and conditions")
	private boolean agreement;
	
	public LCUser() {
		System.out.println("LCUser constructor called");
	}

	public String getYourName() {
		System.out.println("getYourName method called");
		return yourName;
	}

	public void setYourName(String yourName) {
		System.out.println("setYourName method called");
		this.yourName = yourName;
	}

	public String getCrushName() {
		System.out.println("getCrushName method called");
		return crushName;
	}

	public void setCrushName(String crushName) {
		System.out.println("setCrushName method called");
		this.crushName = crushName;
	}

	public boolean getAgreement() {
		System.out.println("getAgreement method called");
		return agreement;
	}

	public void setAgreement(boolean agreement) {
		System.out.println("setAgreement method called");
		this.agreement = agreement;
	}

	@Override
	public String toString() {
		return "LCUser [yourName=" + yourName + ", crushName=" + crushName + ", agreement=" + agreement + "]";
	}

}

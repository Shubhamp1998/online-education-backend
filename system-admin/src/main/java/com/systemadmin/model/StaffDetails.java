package com.systemadmin.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "StaffDetails")
public class StaffDetails {

	@Id
	private Long staffId;
	
	@NotNull
	@Pattern(regexp = "[A-Z]+[a-z]")
	private String name;
	
	@NotBlank(message = "Email Should Not Be Blank")
	@Size(max = 50)
	@Email
	@Pattern(regexp = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}", message = "Please enter a valid email!")
	private String emailId;
	
	@NotNull
	@Pattern(regexp = "^\\d{10}$")
	private String mobileNumber;

	public StaffDetails() {
		super();
	}

	public StaffDetails(Long staffId, String name, String emailId, String mobileNumber) {
		super();
		this.staffId = staffId;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}

package com.systemadmin.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="StudentDetails")
public class StudentDetails {
	@Id
	private String studentId;
	
	@NotBlank
	@Size(max = 20)
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Accepts only alphabets")
	private String username;
	
	@NotNull
	private String studentName;
	
	@NotBlank(message = "Email Should Not Be Blank")
	@Size(max = 50)
	@Email
	@Pattern(regexp = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}", message = "Please enter a valid email!")
	private String email;
	
	@NotNull
	@Pattern(regexp = "^\\d{10}$")
	private String mobNo;
	@NotNull
	private String courseId;
	
	
	public StudentDetails() {
		super();
	}
	
	
	public StudentDetails(String studentId,
			@NotBlank @Size(max = 20) @Pattern(regexp = "^[a-zA-Z]+$", message = "Accepts only alphabets") String username,
			@NotNull String studentName,
			@NotBlank(message = "Email Should Not Be Blank") @Size(max = 50) @Email @Pattern(regexp = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}", message = "Please enter a valid email!") String email,
			@NotNull @Pattern(regexp = "^\\d{10}$") String mobNo, @NotNull String courseId) {
		super();
		this.studentId = studentId;
		this.username = username;
		this.studentName = studentName;
		this.email = email;
		this.mobNo = mobNo;
		this.courseId = courseId;
	}


	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}


	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", username=" + username + ", studentName=" + studentName
				+ ", email=" + email + ", mobNo=" + mobNo + ", courseId=" + courseId + "]";
	}
	
	
	
}




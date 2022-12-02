package com.systemadmin.model;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CourseDetails")
public class CourseDetails {
	
	@Id
	private String courseId;
	@NotBlank
	private String courseName;
	@NotBlank
	private String courseType;
	@NotBlank
	private double fees;
	
	public CourseDetails() {
		super();
	}

	public CourseDetails(String courseId, @NotBlank String courseName, @NotBlank String courseType,
			@NotBlank double fees) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseType = courseType;
		this.fees = fees;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "CourseDetails [courseId=" + courseId + ", courseName=" + courseName + ", courseType=" + courseType
				+ ", fees=" + fees + "]";
	}

	
	
}
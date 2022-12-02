package com.systemadmin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.systemadmin.model.CourseDetails;
import com.systemadmin.model.StudentDetails;
import com.systemadmin.repo.CourseRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	CourseRepository courseRepository;
	
	@GetMapping("/allCourses")
	public List<CourseDetails> getAllCourseDetails(){
		return courseRepository.findAll();
	}
	 
	
	  @PostMapping("/addCourse")
	  public void addCourseDetails(@RequestBody CourseDetails course) {
		  courseRepository.save(course);
	  }
	  
	  @GetMapping("/course/{courseId}")
	  public Optional<CourseDetails> getCourseDetails(@PathVariable("courseId") String courseId ) {
		 return courseRepository.findById(courseId);
	  }

	  @PutMapping("/putCourse/{courseId}")
	  public void updateCourseDetails(@PathVariable String courseId, @RequestBody CourseDetails course) {
		  courseRepository.save(course);
	  }
	  

	  @DeleteMapping("/deleteCourse/{courseId}")
	  public void deleteCourseDetails(@PathVariable String courseId) {
		  courseRepository.deleteById(courseId);
	  }

}

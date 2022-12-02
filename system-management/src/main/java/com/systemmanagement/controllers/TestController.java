package com.systemmanagement.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "";
	}
	
	@GetMapping("/admin")
	@PreAuthorize(" hasRole('ADMIN') or hasRole('STUDENT')")
	public String adminAccess() {
		return "Admin Page";
	}
	
	@GetMapping("/student")
	@PreAuthorize("hasRole('STUDENT')")
	public String studentAccess() {
		return "Student Page";
	}

	/*@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Admin Board.";
	}*/

	@GetMapping("/staff")
	@PreAuthorize("hasRole('STAFF')")
	public String staffAccess() {
		return "Staff Page";
	}
}


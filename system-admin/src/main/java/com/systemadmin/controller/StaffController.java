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
import com.systemadmin.model.StaffDetails;
import com.systemadmin.repo.StaffRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	StaffRepository staffRepository;
	
	
	@GetMapping("/allStaff")
	public List<StaffDetails> getAllStaffDetails(){
		return staffRepository.findAll();
	}
	
	 @GetMapping("staff/{staffId}")
	  public Optional<StaffDetails> getStaffDetails(@PathVariable Long staffId) {
		return staffRepository.findByStaffId(staffId);
	  }

	  @PostMapping("/addStaff")
	  public void addStaffDetails(@RequestBody StaffDetails staff) {
		  staffRepository.save(staff);
	  }

	  @PutMapping("/putStaff/{staffId}")
	  public void updateStaffDetails(@PathVariable String staffId, @RequestBody StaffDetails staff) {
		  staffRepository.save(staff);
	  }

	  @DeleteMapping("deleteStaff/{staffId}")
	  public void deleteStaffDetails(@PathVariable ("staffId") Long staffId) {
		  staffRepository.deleteById(staffId);
	  }

}

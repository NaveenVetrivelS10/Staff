package com.college.staffDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.staffDetails.dto.StaffDto;
import com.college.staffDetails.entity.Department;
import com.college.staffDetails.entity.Staff;
import com.college.staffDetails.service.StaffService;

@RestController
@RequestMapping("/StaffDetails")
public class AppController {

	@Autowired
	private StaffService staffservice;
	
	@GetMapping("/getDepartment")
	public Department fetchingDepartment(StaffDto staffdto)
	{
		return staffservice.fetchingDepartment(staffdto.getDepartmentId());
	}
	
	@GetMapping("/getStaffDetails")	
	public List<Staff> fetchStaffDetails()
	{
		return staffservice.fetchStaffDetails();
	}
	
	@PostMapping("/saveStaffDetails")
	public Staff saveStaffDetails(@RequestBody StaffDto staffdto)
	{
		return staffservice.saveStaffDetails(staffdto);
	}
	
	@PutMapping("/updateStaffDetails/{staffId}")
	public Staff updateStaffDetails(@PathVariable Integer staffId,@RequestBody StaffDto staffdto)
	{
		return staffservice.updateStaffDetails(staffId,staffdto);
	}
	
	@DeleteMapping("/deleteStaffdetails/{staffid}")
	public String deleteStaffdetails(@PathVariable Integer staffid)
	{
		staffservice.deleteStaffdetails(staffid);
		return "The Selected Rows Deleted Successfully";
	}
}

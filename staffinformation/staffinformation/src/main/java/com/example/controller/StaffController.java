package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.EducationInfo;
import com.example.domain.StaffInformation;
import com.example.repository.StaffRepository;
import com.example.staffinformationdto.StaffDTO;

@RestController
@RequestMapping("/Staffinfo")
public class StaffController {
	
	@Autowired
	StaffRepository staffRepository;
	
	@PostMapping("/saveStaffDetails")
	public StaffInformation saveStaffDetails(@RequestBody StaffDTO staffDTO)
	{
		StaffInformation staffInformation=new StaffInformation();
		
	
		return staffRepository.save(staffInformation);
	}
	
}

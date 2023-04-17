package com.example.StaffProject.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StaffInfo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer staffId;
	private String firstName;
	private String lastName;
	private String dob;
	private String bloodGroup;
	private String experience;
	private String mobile;
	private String address;
	private String designation;
}

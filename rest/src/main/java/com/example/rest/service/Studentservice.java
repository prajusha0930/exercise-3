package com.example.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.model.Student;
import com.example.rest.repository.Studentrepository;

@Service
public class Studentservice {
 
	@Autowired
	Studentrepository sr;
	
	public List<Student> all(){
		List<Student> std=sr.findAll();
				return std;
	}
}

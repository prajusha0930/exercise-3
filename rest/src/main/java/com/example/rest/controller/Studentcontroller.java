package com.example.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.model.Student;
import com.example.rest.repository.Studentrepository;
import com.example.rest.service.Studentservice;

@RestController
public class Studentcontroller {

	@Autowired
	Studentrepository sr;
	@GetMapping(value="/id")
	public List<Student> all(){
		return sr.findAll();
			
	}
	@GetMapping("/id/{id}")
	public Student getDetailsById(@PathVariable int id)
	{
		return sr.findById(id).orElse(null);
	}
	@DeleteMapping("/id/{id}")
	public String deleteById(@PathVariable int id)
	{
	    sr.deleteById(id);
	    return "Id details deleted";
	}
	@PostMapping("/save")
	public String deleteById(@RequestBody Student id)
	{
	    sr.save(id);
	    return "Id details saved";
	}
	@PutMapping("/put")
	public Student getdetailsById(@RequestBody Student s)
	{
	    return sr.save(s);
	}
	
}

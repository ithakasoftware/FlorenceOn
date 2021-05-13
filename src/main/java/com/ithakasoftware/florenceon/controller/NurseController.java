package com.ithakasoftware.florenceon.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ithakasoftware.florenceon.exception.InvalidReferenceException;
import com.ithakasoftware.florenceon.model.Nurse;
import com.ithakasoftware.florenceon.service.NurseService;

@RestController
public class NurseController {
	@Autowired
	NurseService nurseService;
	
	@PostMapping("/create")
	public Long createNurse(@RequestBody Nurse nurse) {
		nurseService.save(nurse);
		return nurse.getId();
	}
	
	@GetMapping("/viewAll")
	public Iterable<Nurse> viewAllNurses() {
		return nurseService.findAll();
	}
	
	@GetMapping("/view/{id}")
	public Nurse viewNurseById(@PathVariable ("id") Long id) {
		Optional<Nurse> nurse = nurseService.findById(id);
		if(nurse.isPresent()) {
			return nurse.get();
		}
		
		throw new InvalidReferenceException("Invalid Nurse reference provided");
	}
}

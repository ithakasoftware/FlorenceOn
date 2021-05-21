package com.ithakasoftware.florenceon.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithakasoftware.florenceon.controller.CrudController;
import com.ithakasoftware.florenceon.model.impl.Patient;
import com.ithakasoftware.florenceon.service.CrudService;

@RestController
@RequestMapping("/patient")
public class PatientController extends CrudController<Patient>{
	
	public PatientController(CrudService <Patient> patientService) {
		super(patientService);
	}
	
}

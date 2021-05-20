package com.ithakasoftware.florenceon.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithakasoftware.florenceon.controller.CrudController;
import com.ithakasoftware.florenceon.model.Patient;
import com.ithakasoftware.florenceon.service.ServiceOn;

@RestController
@RequestMapping("/patient")
public class PatientControllerImpl extends CrudController<Patient>{
	
	public PatientControllerImpl(ServiceOn <Patient> patientService) {
		super(patientService);
	}
	
}

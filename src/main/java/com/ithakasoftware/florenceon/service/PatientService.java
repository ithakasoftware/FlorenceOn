package com.ithakasoftware.florenceon.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ithakasoftware.florenceon.model.impl.Patient;

@Service
public class PatientService  extends CrudService<Patient> {

	public PatientService(CrudRepository<Patient, Long> repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}
}

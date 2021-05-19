package com.ithakasoftware.florenceon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ithakasoftware.florenceon.model.Patient;
import com.ithakasoftware.florenceon.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	public void save(Patient patient) {
		patientRepository.save(patient);
	}
	
	public Iterable<Patient> findAll() {
		return patientRepository.findAll();
	}
	
	public Optional<Patient> findById(long id) {
		return patientRepository.findById(id);
	}
	
}

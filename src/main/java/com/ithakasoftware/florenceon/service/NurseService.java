package com.ithakasoftware.florenceon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ithakasoftware.florenceon.model.Nurse;
import com.ithakasoftware.florenceon.repository.NurseRepository;

@Service
public class NurseService {

	@Autowired
	private NurseRepository nurseRepository;
	
	public void save(Nurse nurse) {
		nurseRepository.save(nurse);
	}
	
	public Iterable<Nurse> findAll() {
		return nurseRepository.findAll();
	}
	
	public Optional<Nurse> findById(long id) {
		return nurseRepository.findById(id);
	}
	
}

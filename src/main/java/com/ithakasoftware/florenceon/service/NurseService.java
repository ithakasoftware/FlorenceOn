package com.ithakasoftware.florenceon.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ithakasoftware.florenceon.model.impl.Nurse;

@Service
public class NurseService  extends CrudService<Nurse> {

	public NurseService(CrudRepository<Nurse, Long> repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}
	
}

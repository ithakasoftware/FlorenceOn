package com.ithakasoftware.florenceon.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ithakasoftware.florenceon.model.impl.HealthCenter;

@Service
public class HealthCenterService extends CrudService<HealthCenter> {

	public HealthCenterService(CrudRepository<HealthCenter, Long> repository) {
		super(repository);
	}
	
}

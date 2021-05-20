package com.ithakasoftware.florenceon.service;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public class ServiceOn <T> {

	private CrudRepository<T, Long> repository;
	
	public ServiceOn(CrudRepository<T, Long> repository) {
		this.repository = repository;
	}

	public void save(T healthCenter) {
		repository.save(healthCenter);
	}

	public Iterable<T> findAll() {
		return repository.findAll();
	}

	public Optional<T> findById(long id) {
		return repository.findById(id);
	}

}
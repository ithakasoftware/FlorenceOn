package com.ithakasoftware.florenceon.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ithakasoftware.florenceon.exception.InvalidReferenceException;
import com.ithakasoftware.florenceon.model.DataModel;
import com.ithakasoftware.florenceon.service.ServiceOn;

abstract public class CrudController<T> {

	private ServiceOn serviceOn;

	public CrudController(ServiceOn service) {
		this.serviceOn = service;
	}
	
	@PostMapping("/create")
	public Long create(@RequestBody T t) {
		serviceOn.save(t);
		return ((DataModel)t).getId();
	}
	
	@GetMapping("/viewAll")
	public Iterable<T> viewAll() {
		return serviceOn.findAll();
	}
	
	@GetMapping("/view/{id}")
	public T viewById(@PathVariable ("id") Long id) {
		Optional<T> model = serviceOn.findById(id);
		if(model.isPresent()) {
			return model.get();
		}
		
		throw new InvalidReferenceException("Invalid reference provided");
	}

}
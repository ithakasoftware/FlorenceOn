package com.ithakasoftware.florenceon.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ithakasoftware.florenceon.exception.InvalidReferenceException;
import com.ithakasoftware.florenceon.model.DataModel;
import com.ithakasoftware.florenceon.service.CrudService;

abstract public class CrudController<T> {

	private CrudService <T> service;

	public CrudController(CrudService <T> service) {
		this.service = service;
	}
	
	@PostMapping("/create")
	public Long create(@RequestBody T t) {
		service.save(t);
		return ((DataModel)t).getId();
	}
	
	@GetMapping("/viewAll")
	public Iterable<T> viewAll() {
		return service.findAll();
	}
	
	@GetMapping("/view/{id}")
	public T viewById(@PathVariable ("id") Long id) {
		Optional<T> model = service.findById(id);
		if(model.isPresent()) {
			return model.get();
		}
		
		throw new InvalidReferenceException("Invalid reference provided");
	}

	@DeleteMapping("/view/{id}")
	public void deleteById(@PathVariable ("id") Long id) {
		service.deleteById(id);
	}
}
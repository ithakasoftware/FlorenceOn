package com.ithakasoftware.florenceon.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithakasoftware.florenceon.controller.CrudController;
import com.ithakasoftware.florenceon.model.impl.HealthCenter;
import com.ithakasoftware.florenceon.service.CrudService;

@RestController
@RequestMapping("/healthcenter")
public class HealthCenterController extends CrudController<HealthCenter> {
	
	public HealthCenterController(CrudService <HealthCenter> healthCenterService) {
		super(healthCenterService);
	}
	
	
}

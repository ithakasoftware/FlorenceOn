package com.ithakasoftware.florenceon.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithakasoftware.florenceon.controller.CrudController;
import com.ithakasoftware.florenceon.model.HealthCenter;
import com.ithakasoftware.florenceon.service.ServiceOn;

@RestController
@RequestMapping("/healthcenter")
public class HealthCenterControllerImpl extends CrudController<HealthCenter> {
	
	public HealthCenterControllerImpl(ServiceOn <HealthCenter> healthCenterService) {
		super(healthCenterService);
	}
	
	
}

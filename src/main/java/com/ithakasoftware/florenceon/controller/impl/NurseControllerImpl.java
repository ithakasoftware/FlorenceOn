package com.ithakasoftware.florenceon.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithakasoftware.florenceon.controller.CrudController;
import com.ithakasoftware.florenceon.model.Nurse;
import com.ithakasoftware.florenceon.service.NurseService;
import com.ithakasoftware.florenceon.service.ServiceOn;

@RestController
@RequestMapping("/nurse")
public class NurseControllerImpl extends CrudController<Nurse>{
	
	public NurseControllerImpl(ServiceOn <Nurse> nurseService) {
		super(nurseService);
	}
}

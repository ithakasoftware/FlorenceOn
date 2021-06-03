package com.ithakasoftware.florenceon.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithakasoftware.florenceon.controller.CrudController;
import com.ithakasoftware.florenceon.model.impl.Nurse;
import com.ithakasoftware.florenceon.redis.model.NursePatients;
import com.ithakasoftware.florenceon.service.CrudService;

@RestController
@RequestMapping("/nursepatients")
public class NursePatientsController extends CrudController<NursePatients>{
	
	public NursePatientsController(CrudService <NursePatients> nursePatientsService) {
		super(nursePatientsService);
	}
	
	
}

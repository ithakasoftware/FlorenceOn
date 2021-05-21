package com.ithakasoftware.florenceon.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithakasoftware.florenceon.controller.CrudController;
import com.ithakasoftware.florenceon.model.impl.Nurse;
import com.ithakasoftware.florenceon.service.CrudService;

@RestController
@RequestMapping("/nurse")
public class NurseController extends CrudController<Nurse>{
	
	public NurseController(CrudService <Nurse> nurseService) {
		super(nurseService);
	}
}

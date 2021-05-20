package com.ithakasoftware.florenceon.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithakasoftware.florenceon.controller.CrudController;
import com.ithakasoftware.florenceon.model.Room;
import com.ithakasoftware.florenceon.service.ServiceOn;

@RestController
@RequestMapping("/room")
public class RoomControllerImpl extends CrudController<Room>{
	
	public RoomControllerImpl(ServiceOn <Room> roomService) {
		super(roomService);
	}
}

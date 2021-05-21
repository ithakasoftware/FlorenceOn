package com.ithakasoftware.florenceon.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithakasoftware.florenceon.controller.CrudController;
import com.ithakasoftware.florenceon.model.impl.Room;
import com.ithakasoftware.florenceon.service.CrudService;

@RestController
@RequestMapping("/room")
public class RoomController extends CrudController<Room>{
	
	public RoomController(CrudService <Room> roomService) {
		super(roomService);
	}
}

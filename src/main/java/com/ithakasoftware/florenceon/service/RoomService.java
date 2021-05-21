package com.ithakasoftware.florenceon.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ithakasoftware.florenceon.model.impl.Room;

@Service
public class RoomService  extends CrudService<Room> {

	public RoomService(CrudRepository<Room, Long> repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}
}

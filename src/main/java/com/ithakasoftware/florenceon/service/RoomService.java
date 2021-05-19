package com.ithakasoftware.florenceon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ithakasoftware.florenceon.model.Room;
import com.ithakasoftware.florenceon.repository.RoomRepository;

@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepository;
	
	public void save(Room room) {
		roomRepository.save(room);
	}
	
	public Iterable<Room> findAll() {
		return roomRepository.findAll();
	}
	
	public Optional<Room> findById(long id) {
		return roomRepository.findById(id);
	}
	
}

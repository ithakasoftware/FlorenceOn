package com.ithakasoftware.florenceon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ithakasoftware.florenceon.model.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

}

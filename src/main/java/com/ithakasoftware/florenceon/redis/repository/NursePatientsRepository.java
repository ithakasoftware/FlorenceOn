package com.ithakasoftware.florenceon.redis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ithakasoftware.florenceon.model.impl.Nurse;
import com.ithakasoftware.florenceon.redis.model.NursePatients;

@Repository
public interface NursePatientsRepository extends CrudRepository<NursePatients, String>{

}

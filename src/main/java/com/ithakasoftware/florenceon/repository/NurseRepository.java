package com.ithakasoftware.florenceon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ithakasoftware.florenceon.model.impl.Nurse;

@Repository
public interface NurseRepository extends CrudRepository<Nurse, Long>{

}

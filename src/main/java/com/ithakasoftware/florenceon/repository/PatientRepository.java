package com.ithakasoftware.florenceon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ithakasoftware.florenceon.model.impl.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long>{ 

}

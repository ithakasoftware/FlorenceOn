package com.ithakasoftware.florenceon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ithakasoftware.florenceon.model.impl.HealthCenter;

@Repository
public interface HealthCenterRepository extends CrudRepository<HealthCenter, Long>{

}

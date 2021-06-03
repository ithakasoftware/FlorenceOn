package com.ithakasoftware.florenceon.redis.model;

import java.util.List;

import org.springframework.data.redis.core.RedisHash;

import com.ithakasoftware.florenceon.model.impl.Nurse;
import com.ithakasoftware.florenceon.model.impl.Patient;

import lombok.Data;

@Data
@RedisHash("NursePatients")
public class NursePatients { 
	
	private String coren;
	private Nurse nurse;
	private List<Patient> patients;

}

package com.ithakasoftware.florenceon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Nurse {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long id;
	private final long coren;
	private final String name;
	
}

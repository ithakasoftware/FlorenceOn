package com.ithakasoftware.florenceon.model.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ithakasoftware.florenceon.model.DataModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "tab_patient")
public class Patient  implements DataModel{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long cpf;
	private String name;
}

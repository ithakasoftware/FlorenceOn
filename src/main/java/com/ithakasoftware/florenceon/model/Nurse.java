package com.ithakasoftware.florenceon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tab_nurse")
public class Nurse  implements DataModel{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long coren;
	private String name;
	
}

package com.ithakasoftware.florenceon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "tab_room")
public class Room  implements DataModel{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  long id;
	private String name;
	
}

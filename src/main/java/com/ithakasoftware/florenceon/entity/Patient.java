package com.ithakasoftware.florenceon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Patient {

	private final long id;
	private final long cpf;
	private final String name;
}

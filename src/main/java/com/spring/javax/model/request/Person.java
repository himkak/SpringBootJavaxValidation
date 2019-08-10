package com.spring.javax.model.request;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
	
	@NotNull(message="name should not be null")
	private String name;
	private int age;
	private String email;

}

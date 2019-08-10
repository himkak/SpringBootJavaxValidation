package com.spring.javax.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.javax.model.request.Person;

@RestController("/person")
public class PersonController {
	
	@PostMapping
	public void createPerson(@Valid @RequestBody Person person) {
		System.out.println(person);
	}

}

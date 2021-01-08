package com.circuitebreakproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

	@GetMapping(value = "prod")
	public String sayHello()
	{
		return "String from producer";
	}
}

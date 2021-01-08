package com.circuitebreakfallback.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.circuitebreakfallback.service.MyService;


@RestController
public class FallBackController {

	@Autowired
	private MyService myService;
	
	@GetMapping(value = "url")
	
	public String sayHello()
	{
		return myService.getExternalService();
	}
	
}

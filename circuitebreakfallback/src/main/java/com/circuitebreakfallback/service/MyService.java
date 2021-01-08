package com.circuitebreakfallback.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MyService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "solution")
	public String getExternalService()
	{
		
			URI uri = URI.create("http://localhost:/9090/prod");
			return this.restTemplate.getForObject(uri, String.class);
		
	}
	
	public String solution()
	{
		return "solution is : server is down";
	}
}

package com.circuitebreakfallback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker
@SpringBootApplication
public class CircuitebreakfallbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitebreakfallbackApplication.class, args);
	}

	@Bean
	public RestTemplate createRestTemplate()
	{
		return new RestTemplate();
	}
}

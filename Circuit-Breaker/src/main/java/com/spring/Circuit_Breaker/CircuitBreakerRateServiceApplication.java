package com.spring.Circuit_Breaker;

import com.spring.Circuit_Breaker.entity.Rate;
import com.spring.Circuit_Breaker.repo.RateRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class CircuitBreakerRateServiceApplication {

	@Autowired
	private RateRepository rateRepository;

	public static void main(String[] args) {

		SpringApplication.run(CircuitBreakerRateServiceApplication.class, args);
	}

	@PostConstruct
	public void setupData(){

		rateRepository.saveAll(Arrays.asList(

				Rate.builder().id(1).type("PERSONAL").rateValue(10.0).build(),
				Rate.builder().id(1).type("HOUSING").rateValue(8.0).build()));
	}
}

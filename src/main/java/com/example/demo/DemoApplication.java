package com.example.demo;

import com.example.demo.*;
import com.example.demo.dto.CustomerDTO;
import com.example.demo.model.Customer;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Customer customer = Customer.builder().id(1).city("Bucharest").username("Username").country("Romania").build();
	}
}

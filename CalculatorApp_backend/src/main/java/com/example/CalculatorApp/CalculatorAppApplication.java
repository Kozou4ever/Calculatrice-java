package com.example.CalculatorApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CalculatorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorAppApplication.class, args);
	}

	@RequestMapping("/")
	public String hello(){
		return "Hello world";
	}

}

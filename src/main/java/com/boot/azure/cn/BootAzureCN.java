package com.boot.azure.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootAzureCN {

	public static void main(String[] args) {
		SpringApplication.run(BootAzureCN.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Spring Boot + Docker + Azure +";
	}

}

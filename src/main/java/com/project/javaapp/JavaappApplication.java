package com.project.javaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaappApplication {

	@GetMapping("/")
	public String getmessage()
	{
		return "Welcome to java project....";
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaappApplication.class, args);
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmaiSendingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmaiSendingApplication.class, args);
		System.out.println("Email Application is Running sucessfully....");
	}

}

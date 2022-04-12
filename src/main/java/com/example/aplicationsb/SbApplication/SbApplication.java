package com.example.aplicationsb.SbApplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SbApplication {

	public static void main(String[] args) {

		SpringApplication.run(SbApplication.class, args);
	}
	// Writes a List of string "Hello World, I'm building an API!", "Let's get started!" in JSON

	// Writes "Hello World" directly to the server on localhost8080 like HTML p
/*	@GetMapping
	public String things(){
		return "Hello";
	}*/

}

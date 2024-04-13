package com.bhrsb.mpkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MPKK {

	public static void main(String[] args) {
		SpringApplication.run(MPKK.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello World from BHR \n This Java Spring Boot Wildfly thingy took so long to be up and running";
	}


}

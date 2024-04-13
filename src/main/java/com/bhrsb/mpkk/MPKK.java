package com.bhrsb.mpkk;

import java.util.List;

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

	public List<String> hello(){
		return List.of("Hello","World");
	}


}

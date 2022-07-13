package com.example.addnumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AddNumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddNumberApplication.class, args);
	}

}

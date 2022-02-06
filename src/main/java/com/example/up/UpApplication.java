package com.example.up;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UpApplication {

	@GetMapping("/hello")
	public String home()
	{
		return "Name - vaishali";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(UpApplication.class, args);
	}

}

package com.api.feedfilmes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FeedFilmesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedFilmesApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "Bora Bill!";
	}
}

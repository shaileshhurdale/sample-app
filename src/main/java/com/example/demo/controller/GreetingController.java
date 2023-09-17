package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@GetMapping("/")
	public String showGreetingMsg() {
		return "welcome to sample-app!";
	}
	
}

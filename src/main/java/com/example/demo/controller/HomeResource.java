package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/")
	public String home() {
		return "Hello";
	}

	@GetMapping("/user")
	public String user() {
		return "Welcome User";
	}

	@GetMapping("/admin")
	public String admin() {
		return "Welcome Admin";
	}

}
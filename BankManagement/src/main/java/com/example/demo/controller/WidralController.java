package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.WidralService;

@RestController
public class WidralController {
 
	@Autowired
	WidralService service;
	
	@GetMapping("/widral")
	public String wid(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("accountNumber") Integer accountNumber,@RequestParam("widral") Integer widral,@RequestParam("pass") String pass) {
		
		return service.widral(name,email,accountNumber, widral, pass);
	}
	
}

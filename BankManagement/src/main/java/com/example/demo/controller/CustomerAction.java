package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerAction {

	@GetMapping("/normalAction")
	public String normalAction(@RequestParam("option") String option) {
		String message=null;
		if(option.equalsIgnoreCase("deposit"))
		message="deposit";
		else if(option.equalsIgnoreCase("widral"))
			message="widral";
	
		else {
			message="entry";
		}
		
		return message;
	}
	
	
}

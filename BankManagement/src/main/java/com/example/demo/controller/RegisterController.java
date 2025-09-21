package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitties.BankRegistration;
import com.example.demo.repository.RegisterRepository;

@Controller
public class RegisterController {
	@Autowired
	RegisterRepository reg;
   
	@GetMapping("/register")
	public String register(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("password") String password) {
	String message=null;	
		if(name.equalsIgnoreCase("shwet kumar dhankar")&&email.equalsIgnoreCase("kshwet642@gmail.com")&&password.equalsIgnoreCase("dhankar90")) {
			message="admin";
		}
		else {
		BankRegistration bank=new BankRegistration(name,email,password,"1000","0","0","1000");
	    reg.save(bank);
	    message="action";
		}
	    return message;
	} 
	
}

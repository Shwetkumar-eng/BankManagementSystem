package com.example.demo.view;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entitties.BankRegistration;
import com.example.demo.repository.RegisterRepository;

@Controller
public class Pages {

	@Autowired
	RegisterRepository repo;
	
	@GetMapping("/reg")
	public String reg() {
		return "register";
	}
	
	@GetMapping("/")
	public String home() {
		return "login";
	}
	
	
	
	@GetMapping("/login")
	public String login(@RequestParam("id") Integer id,@RequestParam("password") String password) {
		String message=null;
		if(id==2&&password.equalsIgnoreCase("dhankar90")) {
			message="admin";
		}
		else {
			Optional<BankRegistration> option=repo.findByIdAndPass(id, password);
			if(option.isPresent())
				message="action";
			else {
				message="register";
			}
			
		}
		return message;
	}
	
	
	
}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitties.Depositor;
import com.example.demo.service.DepositorService;

@RestController
public class DepositController {
    
	@Autowired
	DepositorService service;
	
	@GetMapping("/deposit")
	public String deposit(@RequestParam("name") String name,@RequestParam("phone") String phone,@RequestParam("email") String email,@RequestParam Integer accountNumber,@RequestParam Integer deposit) {
		return service.deposit(name,phone,email,accountNumber, deposit);
	}
	@GetMapping("/find")
	public List<String> find(@RequestParam Integer accountNumber) {
		return service.find(accountNumber);
	}
}

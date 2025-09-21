package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitties.EntriesAcount;
import com.example.demo.repository.EntriesAcountRepository;

@RestController
public class EntriesController {

	@Autowired
	EntriesAcountRepository repo;
	
	@GetMapping("/entry")
	public List<EntriesAcount> entry(@RequestParam("accountNumber") Integer accountNumber){
		return repo.findByAccountNumber(accountNumber).stream().toList();
	}
	
}

package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitties.BankRegistration;
import com.example.demo.entitties.Depositor;
import com.example.demo.entitties.EntriesAcount;
import com.example.demo.entitties.Widraller;
import com.example.demo.repository.CustomWidral;
import com.example.demo.repository.DepositorRepository;
import com.example.demo.repository.EntriesAcountRepository;
import com.example.demo.repository.RegisterRepository;

@RestController
public class AdminAction {

	@Autowired
	DepositorRepository repo;
	
	@Autowired
	CustomWidral wid;
	
	@Autowired
	RegisterRepository reg;
	
	@Autowired
	EntriesAcountRepository ent;
	
	@GetMapping("/adminAction")
	public List<Object> list(@RequestParam("option") String option){
		List<Object> li=new ArrayList<>();
		if(option.equalsIgnoreCase("depositor")) {
			Iterable<Depositor> itr=repo.findAll();
			Iterator<Depositor> i=itr.iterator();
			while(i.hasNext()) {
				Depositor d=i.next();
				li.add(d);
			}
			
		}
		
		else if(option.equalsIgnoreCase("widraller")) {
			Iterable<Widraller> itr=wid.findAll();
			Iterator<Widraller> i=itr.iterator();
			while(i.hasNext()) {
				Widraller w=i.next();
				li.add(w);
			}
			
		}
		
		else if(option.equalsIgnoreCase("customer")) {
			Iterable<BankRegistration> itr=reg.findAll();
			Iterator<BankRegistration> i=itr.iterator();
			while(i.hasNext()) {
				BankRegistration b=i.next();
				li.add(b);
			}
			
		}
		
		else if(option.equalsIgnoreCase("entries")) {
			Iterable<EntriesAcount> itr=ent.findAll();
			Iterator<EntriesAcount> i=itr.iterator();
			while(i.hasNext()) {
				EntriesAcount e=i.next();
				li.add(e);
			}
			
		}
		
		
		return li;
	}
}

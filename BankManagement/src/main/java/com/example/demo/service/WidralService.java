package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entitties.BankRegistration;
import com.example.demo.entitties.Depositor;
import com.example.demo.entitties.EntriesAcount;
import com.example.demo.entitties.Widraller;
import com.example.demo.repository.CustomWidral;
import com.example.demo.repository.EntriesAcountRepository;
import com.example.demo.repository.RegisterRepository;

@Service
public class WidralService {
	
	@Autowired
	RegisterRepository repo;
	@Autowired
	CustomWidral wid;
	@Autowired
	EntriesAcountRepository ent;
	
	public String widral(String name,String email,Integer accountNumber,Integer widral,String pass) {
		String message=null;
		Optional<BankRegistration> option=repo.findByIdAndPass(accountNumber, pass);
		BankRegistration b1=option.get();
		//Integer before=Integer.parseInt(b1.getInitialAmount());
		Integer after=Integer.parseInt(b1.getTotalAmount());
		Integer before=after;
		Integer lastAmount=before-widral;
		if(lastAmount>1000) {
		b1.setWidral(widral.toString());
		b1.setInitialAmount(before.toString());
		b1.setTotalAmount(lastAmount.toString());
		repo.save(b1);
		
		Widraller d1=new Widraller(name, email, widral.toString(), accountNumber, before.toString(), lastAmount.toString());
		wid.save(d1);
		
		EntriesAcount entries=new EntriesAcount(before.toString(),"0", widral.toString(),lastAmount.toString(), accountNumber);
		ent.save(entries);
		
		
		message= widral.toString()+"widral on this account number "+accountNumber.toString();
		}
		else {
			message="your total amount is less than 1000";
		}
		return message;
	}
	
}

package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entitties.BankRegistration;
import com.example.demo.entitties.Depositor;
import com.example.demo.entitties.EntriesAcount;
import com.example.demo.repository.DepositorRepository;
import com.example.demo.repository.EntriesAcountRepository;
import com.example.demo.repository.RegisterRepository;

@Service
public class DepositorService {

	@Autowired
	DepositorRepository depo;
	@Autowired
	RegisterRepository reg;
	@Autowired
	EntriesAcountRepository ent;
	
	public String deposit(String name,String phone,String email,Integer accountNumber,Integer deposit) {
		Optional<BankRegistration> option=reg.findById(accountNumber);
		BankRegistration b1=option.get();
		//Integer before=Integer.parseInt(b1.getInitialAmount());
		Integer after=Integer.parseInt(b1.getTotalAmount());
		Integer before=after;
		Integer lastAmount=before+deposit;
		b1.setDeposit(deposit.toString());
		b1.setInitialAmount(before.toString());
		b1.setTotalAmount(lastAmount.toString());
		reg.save(b1);
		
		Depositor d1=new Depositor(name,phone,email,accountNumber, before.toString(),deposit.toString(),lastAmount.toString());
		depo.save(d1);
		
		EntriesAcount account=new EntriesAcount(before.toString(), deposit.toString(), "0", lastAmount.toString(), accountNumber);
		
		ent.save(account);
		return deposit.toString()+" this account number "+accountNumber.toString();
		
		
	}
	public List<String> find(Integer accountNumber) {
		ArrayList<String> list=new ArrayList<>();
		Iterable<Depositor> itr=depo.findByAccountNumber(accountNumber);
		Iterator<Depositor> i=itr.iterator();
		while(i.hasNext()) {
			Depositor d=i.next();
			list.add("Before: "+d.getBeforeBalance());
			list.add("Deposit: "+d.getDeposit());
			list.add("After: "+d.getAfterBalance());
		}
		//Depositor d3=option.get();
		//list.add(d3);
		return list;
	}
	
}

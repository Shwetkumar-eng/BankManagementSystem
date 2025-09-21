package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitties.EntriesAcount;

public interface EntriesAcountRepository extends JpaRepository<EntriesAcount, Long> {

	public List<EntriesAcount> findByAccountNumber(Integer accountNumber); 
	
	
}

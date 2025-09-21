package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entitties.BankRegistration;

public interface RegisterRepository extends CrudRepository<BankRegistration, Integer> {

	public Optional<BankRegistration> findByIdAndPass(Integer id,String pass);
}

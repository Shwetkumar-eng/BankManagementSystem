package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entitties.Depositor;

public interface DepositorRepository extends CrudRepository<Depositor, Integer> {
public Iterable<Depositor> findByAccountNumber(Integer accountNumber);
}

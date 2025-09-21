package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitties.Widraller;

public interface CustomWidral extends JpaRepository<Widraller, Integer> {

	
}

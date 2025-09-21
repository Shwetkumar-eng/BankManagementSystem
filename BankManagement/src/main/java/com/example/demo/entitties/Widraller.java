package com.example.demo.entitties;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Widraller {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private String widral;
	private Integer accountNumber;
	private String beforeAmount;
	private String afterAmount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWidral() {
		return widral;
	}
	public void setWidral(String widral) {
		this.widral = widral;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBeforeAmount() {
		return beforeAmount;
	}
	public void setBeforeAmount(String beforeAmount) {
		this.beforeAmount = beforeAmount;
	}
	public String getAfterAmount() {
		return afterAmount;
	}
	public void setAfterAmount(String afterAmount) {
		this.afterAmount = afterAmount;
	}
	public Widraller(String name, String email, String widral, Integer accountNumber, String beforeAmount,
			String afterAmount) {
		super();
		this.name = name;
		this.email = email;
		this.widral = widral;
		this.accountNumber = accountNumber;
		this.beforeAmount = beforeAmount;
		this.afterAmount = afterAmount;
	}
	public Widraller() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	
}

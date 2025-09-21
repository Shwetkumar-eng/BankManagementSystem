package com.example.demo.entitties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Depositor {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	
	public String name;
	public String mobile;
	public String email;
	public Integer accountNumber;
	public String beforeBalance;
	public String deposit;
	public String afterBalance;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBeforeBalance() {
		return beforeBalance;
	}
	public void setBeforeBalance(String beforeBalance) {
		this.beforeBalance = beforeBalance;
	}
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getAfterBalance() {
		return afterBalance;
	}
	public void setAfterBalance(String afterBalance) {
		this.afterBalance = afterBalance;
	}
	public Depositor(String name, String mobile, String email,Integer accountNumber, String beforeBalance,
			String deposit, String afterBalance) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.accountNumber = accountNumber;
		this.beforeBalance = beforeBalance;
		this.deposit = deposit;
		this.afterBalance = afterBalance;
	}
	public Depositor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

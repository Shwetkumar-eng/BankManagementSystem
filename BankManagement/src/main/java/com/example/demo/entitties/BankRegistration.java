package com.example.demo.entitties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BankUser")
public class BankRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String  name;
	private String email;
	private String pass;
	private String initialAmount;
	private String deposit;
	private String widral;
	private String totalAmount;
	
	
	public String getWidral() {
		return widral;
	}
	public void setWidral(String widral) {
		this.widral = widral;
	}
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
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getInitialAmount() {
		return initialAmount;
	}
	public void setInitialAmount(String initialAmount) {
		this.initialAmount = initialAmount;
	}
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public BankRegistration(String name, String email, String pass, String initialAmount, String deposit,
			String totalAmount) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.initialAmount = initialAmount;
		this.deposit = deposit;
		this.totalAmount = totalAmount;
	}
	public BankRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankRegistration(String name, String email, String pass, String initialAmount, String deposit, String widral,
			String totalAmount) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.initialAmount = initialAmount;
		this.deposit = deposit;
		this.widral = widral;
		this.totalAmount = totalAmount;
	}
	
	
	
}

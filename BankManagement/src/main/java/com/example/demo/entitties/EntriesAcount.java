package com.example.demo.entitties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EntriesAcount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String beforeAmount;
	private String deposit;
	private String widral;
	private String totalAmount;
	private Integer accountNumber;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBeforeAmount() {
		return beforeAmount;
	}
	public void setBeforeAmount(String beforeAmount) {
		this.beforeAmount = beforeAmount;
	}
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getWidral() {
		return widral;
	}
	public void setWidral(String widral) {
		this.widral = widral;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public EntriesAcount(String beforeAmount, String deposit, String widral, String totalAmount,
			Integer accountNumber) {
		super();
		this.beforeAmount = beforeAmount;
		this.deposit = deposit;
		this.widral = widral;
		this.totalAmount = totalAmount;
		this.accountNumber = accountNumber;
	}
	public EntriesAcount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

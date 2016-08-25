package com.example.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SA")
public class SavingAccount extends Account {

	private static final long serialVersionUID = 1L;

	private Double interestRate;

	public SavingAccount(Customer customer, Date creationDate, Double balance, Double interestRate) {
		super(customer, creationDate, balance);
		this.interestRate = interestRate;
	}

	public SavingAccount() {
		super();
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
}

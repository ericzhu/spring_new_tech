package com.example.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CA")
public class CheckingAccount extends Account {

	private static final long serialVersionUID = 1L;

	private Double overDraft;

	public CheckingAccount(Customer customer, Date creationDate, Double balance, Double overDraft) {
		super(customer, creationDate, balance);
		this.overDraft = overDraft;
	}

	public CheckingAccount() {
		super();
	}

	public Double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(Double overDraft) {
		this.overDraft = overDraft;
	}
}

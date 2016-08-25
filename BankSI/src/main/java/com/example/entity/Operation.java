package com.example.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "OPERATION_TYPE", length = 2)
public abstract class Operation implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long operationNumber;

	private Double amount;

	private Account account;

	@ManyToOne
	@JoinColumn(name = "EMP_NUM")
	private Employee employee;

	private Date operationDate;

	public Operation(Double amount, Account account) {
		super();
		this.amount = amount;
		this.account = account;
	}

	public Operation() {
		super();
	}

	public Long getOperationNumber() {
		return operationNumber;
	}

	public void setOperationNumber(Long operationNumber) {
		this.operationNumber = operationNumber;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Date getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}

}

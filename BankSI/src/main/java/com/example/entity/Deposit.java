package com.example.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("WD")
public class Deposit extends Operation {

	private static final long serialVersionUID = 1L;

}

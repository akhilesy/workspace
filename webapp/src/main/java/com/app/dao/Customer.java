package com.app.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.GeneratedValue;


	
	@Entity
	@Table(name = "customers")
	public class Customer {
	    @Id
	    @Column(name = "customer_id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 
	    private String name;
	    private String email;

}


package com.promineo.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Data;







@Data
@Entity
@Table
public class Gardner {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gardner_id;
	
	
	@Column(name = "first_name", nullable = false, length = 512, unique = true)
	private String firstName;
	
	@Column (name= "last_name", nullable =false)
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="region")
	private String region;
	
	@Column(name="climate")
	private String climate;
	
	@Column(name="start_date")
	private String startDate;
	

	
	
}

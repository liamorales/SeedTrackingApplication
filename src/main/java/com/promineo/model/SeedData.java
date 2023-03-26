package com.promineo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name ="Seed Data")
public class SeedData {

	@Column
	private String notes_id;
	
	
	@Id
	@Column
	private String seed_id;


}

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
@Table (name ="Seed Data")
public class SeedData {

	@Column
	private String notes_id;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int seed_id;


}

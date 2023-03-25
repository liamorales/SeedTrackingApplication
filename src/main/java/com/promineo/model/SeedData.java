package com.promineo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name ="Seed Data")
public class SeedData {

	@Column(name="notes")
	@Id
	private String notes_id;
	
	@OneToOne(mappedBy = "Seeds")
	@Id
	private String seed_id;


}

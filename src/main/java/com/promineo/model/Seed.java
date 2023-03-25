package com.promineo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "Seeds")
public class Seed {
	
	@ManyToMany
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_add_SeedData")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long seed_id;
	
	@Column(name ="plant_name")
private String name;

	
}

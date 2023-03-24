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
@Table(name= "seeds")
public class Seed {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
	
	@Column(name ="plant_name", nullable = false)
private String name;

}

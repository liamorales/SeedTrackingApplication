package com.promineo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
@Table (name="PlantLocation")
public class PlantLocation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int seed_id;
	
	@Column
	public String seedLocation;
	
	@Column
	public String seedNeighbor;
	
	
	@Column
	private int gardner_id;
	
}

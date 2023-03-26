package com.promineo.model;

import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.Table;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
@Table (name="Plant Location")
public class PlantLocation {

	@Id
	@Column
	private String seed_id;
	
	@Column
	public String seedLocation;
	
	@Column
	public String seedNeighbor;
	
	
	@Column
	private String gardner_id;
	
}

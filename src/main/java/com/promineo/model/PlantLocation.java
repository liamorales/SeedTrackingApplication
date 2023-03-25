package com.promineo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
@Table (name="Plant Location")
public class PlantLocation {

	@ManyToOne
	@JoinColumn(name ="seed_id")
	@Id
	private String seed_id;
	
	@Column
	public String seedLocation;
	
	@Column
	public String seedNeighbor;
	
	@ManyToOne
	@JoinColumn(name ="gardner_id")
	@Id
	private String gardner_id;
	
}

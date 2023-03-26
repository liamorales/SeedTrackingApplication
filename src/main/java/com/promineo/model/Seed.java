package com.promineo.model;




//import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "Seeds")
public class Seed {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long seed_id;
	
//	@ManyToMany(mappedBy ="seeds")
//	private Set<SeedTracking> trackedSeedData= new HashSet<>();
	
	
	@Column(name ="plant_name", length = 512, nullable = false, unique = true)
private String name;

//	public Set<SeedTracking>getTrackedSeedData(){
//		return trackedSeedData;
//	}
	
	private byte[] content;
}

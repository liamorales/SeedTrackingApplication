package com.promineo.model;




//import java.util.HashSet;
//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "Seeds")
public class Seed {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int seed_id; 
	
//	@ManyToMany(mappedBy ="seeds")
//	@JoinTable(name= "seed_role",
//	joinColumns = {
//			@JoinColumn (name = "seed_id")},
//	inverseJoinColumns = {
//			@JoinColumn (name = "seedTracking_id")
//	})
//private Set<SeedTracking> trackedSeedData= new HashSet<>();
//	
	
	@Column(name = "type", length = 512, nullable = false, unique = true)
private String name;

//	public Set<SeedTracking>getTrackedSeedData(){
//		return trackedSeedData;
//	}
	
//	private byte[] content;
}

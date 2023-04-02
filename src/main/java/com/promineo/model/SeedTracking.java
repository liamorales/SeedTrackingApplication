package com.promineo.model;

//import java.util.HashSet;
//import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import lombok.Getter;
//import lombok.Setter;



@Data
@Entity
@Table
public class SeedTracking {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int seedTracking_id;
	
	public String progress_id;
	
//	@ManyToMany (mappedBy = "seedTracking")
//	@JsonIgnore
//
//	private Set<Seed> seeds = new HashSet<>();
	
	@Column
	public String status_id;
	
	@Column
	public String notes_id;
	
	
	@Column
	private int gardner_id;
	
	private int seed_id;
	
	//private byte[] content;
	
//	public Set <Seed> getSeeds(){
//		return seeds;}
	

}

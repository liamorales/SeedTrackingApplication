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
//import javax.persistence.Table;
//import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class SeedTracking {
//	@ManyToMany
//	@JoinTable( 
//			name="Track_progress",
//			joinColumns = @JoinColumn(name = "seed_id"),
//			inverseJoinColumns = @JoinColumn(name = "progress_id")
//			)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public String progress_id;
	
//	private Set<Seed> seeds = new HashSet<>();
	
	@Column
	public String status_id;
	
	@Column
	public String notes_id;
	
	
	@Column
	private String gardner_id;
	
	private long seed_id;
	
	private byte[] content;
	
//	public Set <Seed> getSeeds(){
//		return seeds;}
	

}

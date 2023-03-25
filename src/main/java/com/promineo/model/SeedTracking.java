package com.promineo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class SeedTracking {
	
	@Column
	@Id
	public String progress_id;
	
	@Column
	@Id
	public String status_id;
	
	@Column
	@Id
	public String notes_id;
	
	@ManyToOne
	@JoinColumn(name="gardner_id")
	@Id
	private String gardner_id;
	
	@ManyToOne
	@JoinColumn(name="seed_id")
	@Id
	public String seed_id;

}

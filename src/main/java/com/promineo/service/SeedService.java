package com.promineo.service;

import java.util.List;

import com.promineo.model.Seed;

public interface SeedService {
	
	//CREATING or POSTING a seed
	public Seed saveSeed(Seed seed);

	//Get all of the seeds
	public List<Seed>getAllSeeds();
	
	//Get a seed by Id
	public Seed getSeedById(int id);

	//Update a seed
	public Seed updateSeed(Seed seed, int id);

	//Delete seed
	public void deleteSeed(int id);
	

}

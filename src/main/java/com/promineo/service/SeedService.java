package com.promineo.service;

import java.util.List;

import com.promineo.model.Seed;

public interface SeedService {
	Seed saveSeed(Seed seed);

	//Here we are writing our foundations for our get methods
	List<Seed>getAllSeeds();
	
	//Here we are writing our foundations for our put methods
	Seed getSeedById(long id);
	
	//Here we are writing our foundations for our update methods
	Seed updateSeed(Seed seed, long id);
}

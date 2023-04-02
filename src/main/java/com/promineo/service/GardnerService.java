package com.promineo.service;

import java.util.List;

import com.promineo.model.Gardner;


public interface GardnerService {

	//CREATING or POSTING a Gardener
	Gardner saveGardner (Gardner gardner);

	//Get all gardeners
List<Gardner>getAllGardners();

//Get a gardener by Id
Gardner getGardnerById(int id);

//Update a gardener
Gardner updateGardner(Gardner gardner, int id);

//Delete seed
	void deleteGardner(int id);
}

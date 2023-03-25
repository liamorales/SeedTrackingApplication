package com.promineo.service;

import java.util.List;

import com.promineo.model.Gardner;


public interface GardnerService {
Gardner saveGardner (Gardner gardner);

//Here we are writing our foundations for our get methods
List<Gardner>getAllGardner();

//Here we are writing our foundations for our put method

Gardner getGardnerById(long id);

//Here we are writing our foundations for our update methods
Gardner updateGardner(Gardner gardner, long id);

//Here we will be writing our foundation for our delete method
	void deleteGardner(long id);
}

package com.promineo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promineo.model.Gardner;

@Repository
public interface GardnerRepository extends JpaRepository<Gardner, Integer> {

}

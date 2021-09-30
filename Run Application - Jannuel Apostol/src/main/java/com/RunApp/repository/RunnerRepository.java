package com.RunApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RunApp.model.Runner;

@Repository
public interface RunnerRepository extends JpaRepository<Runner, Integer> {

	
}

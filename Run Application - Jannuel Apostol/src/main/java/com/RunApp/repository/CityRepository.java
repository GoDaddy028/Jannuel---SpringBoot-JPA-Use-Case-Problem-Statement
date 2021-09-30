package com.RunApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.RunApp.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, String> {

	@Query(value = "SELECT * FROM City")
	public List<City> showCityList();
}

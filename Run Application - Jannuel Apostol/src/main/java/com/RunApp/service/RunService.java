package com.RunApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RunApp.model.City;
import com.RunApp.repository.CityRepository;
import com.RunApp.repository.RunRepository;
import com.RunApp.repository.RunnerRepository;

@Service
public class RunService {

	CityRepository cityRepo;
	RunnerRepository runnerRepo;
	RunRepository runRepo;

	@Autowired
	public RunService(CityRepository cityRepo, RunnerRepository runnerRepo, RunRepository runRepo) {
		this.cityRepo = cityRepo;
		this.runnerRepo = runnerRepo;
		this.runRepo = runRepo;
	}

	public List<City> showCityList(){
		return cityRepo.showCityList();
	}
	
	public List<Integer> getTotalDistance(int runnerid){
		return runRepo.getTotalDistance(runnerid);
	}
	
}

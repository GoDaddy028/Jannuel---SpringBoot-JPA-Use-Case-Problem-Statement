package com.RunApp.data;

public class Tracker {

	String run_runner;
	String run_city;
	String run_region;
	int run_distance;

	public Tracker() {

	}

	public Tracker(String run_runner, String run_city, String run_region, int run_distance) {
		this.run_runner = run_runner;
		this.run_city = run_city;
		this.run_region = run_region;
		this.run_distance = run_distance;
	}

	public String getRun_runner() {
		return run_runner;
	}

	public void setRun_runner(String run_runner) {
		this.run_runner = run_runner;
	}

	public String getRun_city() {
		return run_city;
	}

	public void setRun_city(String run_city) {
		this.run_city = run_city;
	}

	public String getRun_region() {
		return run_region;
	}

	public void setRun_region(String run_region) {
		this.run_region = run_region;
	}

	public int getRun_distance() {
		return run_distance;
	}

	public void setRun_distance(int run_distance) {
		this.run_distance = run_distance;
	}

}

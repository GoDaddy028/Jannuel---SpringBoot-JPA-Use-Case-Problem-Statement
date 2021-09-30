package com.RunApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class City {

	@Id
	int city_id;
	String city_name;
	String city_region;

	@OneToOne(mappedBy = "city")
	Runner runner;

	public City() {

	}

	public City(int city_id, String city_name, String city_region, Runner runner) {
		this.city_id = city_id;
		this.city_name = city_name;
		this.city_region = city_region;
		this.runner = runner;
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getCity_region() {
		return city_region;
	}

	public void setCity_region(String city_region) {
		this.city_region = city_region;
	}

	public Runner getRunner() {
		return runner;
	}

	public void setRunner(Runner runner) {
		this.runner = runner;
	}

}

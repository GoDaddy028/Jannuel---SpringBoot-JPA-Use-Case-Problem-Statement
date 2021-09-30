package com.RunApp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "runners")
public class Runner {

	@Id
	int runner_id;

	String runner_name;

	@OneToMany(mappedBy = "runner")
	List<Run> runs;

	@OneToOne
	@JoinColumn(name = "runner_city", referencedColumnName = "city_id")
	City city;

	public Runner() {

	}

	public Runner(int runner_id, String runner_name, List<Run> runs, City city) {
		this.runner_id = runner_id;
		this.runner_name = runner_name;
		this.runs = runs;
		this.city = city;
	}

	public int getRunner_id() {
		return runner_id;
	}

	public void setRunner_id(int runner_id) {
		this.runner_id = runner_id;
	}

	public String getRunner_name() {
		return runner_name;
	}

	public void setRunner_name(String runner_name) {
		this.runner_name = runner_name;
	}

	public List<Run> getRuns() {
		return runs;
	}

	public void setRuns(List<Run> runs) {
		this.runs = runs;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}

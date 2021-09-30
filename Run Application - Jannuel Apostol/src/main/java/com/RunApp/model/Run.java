package com.RunApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "run")
public class Run {

	@Id
	int run_id;

	@ManyToOne
	@JoinColumn(name = "run_runner", referencedColumnName = "runner_id")
	Runner runner;

	int run_distance;

	public Run() {

	}

	public Run(int run_id, Runner runner, int run_distance) {
		this.run_id = run_id;
		this.runner = runner;
		this.run_distance = run_distance;
	}

	public int getRun_id() {
		return run_id;
	}

	public void setRun_id(int run_id) {
		this.run_id = run_id;
	}

	public Runner getRunner() {
		return runner;
	}

	public void setRunner(Runner runner) {
		this.runner = runner;
	}

	public int getRun_distance() {
		return run_distance;
	}

	public void setRun_distance(int run_distance) {
		this.run_distance = run_distance;
	}

}

package com.RunApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.RunApp.model.Run;

@Repository
public interface RunRepository extends JpaRepository<Run, Integer> {

	
	@Query(value = "SELECT run.run_distance FROM run INNER JOIN "
			+ "runners ON run.run_name=runners.runner_id "
			+ "WHERE runner.runner_id=:runnerid", nativeQuery = true)
	public List<Integer> getTotalDistance(int runnerid);
}

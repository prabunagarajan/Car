package com.oasys.car.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.oasys.car.entity.CarEntity;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Integer>{
	
	@Query(value="select * from car inner join engine on car.engine_id=engine.engineid",nativeQuery = true)
	public List<CarEntity> getCarWithEngine();
	

}

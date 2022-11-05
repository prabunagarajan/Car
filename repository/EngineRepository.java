package com.oasys.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oasys.car.entity.EngineEntity;


@Repository
public interface EngineRepository extends JpaRepository<EngineEntity, Integer>{

}

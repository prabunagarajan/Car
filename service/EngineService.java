package com.oasys.car.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.car.entity.EngineEntity;
import com.oasys.car.repository.EngineRepository;

@Service
public class EngineService {
	
	@Autowired
	EngineRepository engineRepository;
	
	public String addengine(EngineEntity engineEntity) {
		engineRepository.save(engineEntity);
		return "Saved Successfully";
		
	}

}

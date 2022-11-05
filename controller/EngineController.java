package com.oasys.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.car.entity.EngineEntity;
import com.oasys.car.service.EngineService;

@RestController
public class EngineController {
	
	@Autowired
	EngineService engineService;
	
	@PostMapping("addengine")
	public String addengine(@RequestBody EngineEntity engineEntity) {
		return engineService.addengine(engineEntity);
	}

}

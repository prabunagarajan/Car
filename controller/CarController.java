package com.oasys.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.oasys.car.entity.CarEntity;
import com.oasys.car.service.CarService;



@RestController
public class CarController {
	
	@Autowired
	CarService carService;
	
	//@GetMapping(value="/getbyid/{id}")
	//public CarEntity getById(@PathVariable int id) throws CarNotFoundException {
	//	return carService.getById(id);
	//}
	
	@PostMapping("/addcar")
	public String addcar(@RequestBody CarEntity carEntity) {
		return carService.addcar(carEntity);
	}
	
	
	@GetMapping("/getCarWithEngine")
	public List<CarEntity> getCarWithEngine(){
		return carService.getCarWithEngine();
	}

}

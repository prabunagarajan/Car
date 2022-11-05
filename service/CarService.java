package com.oasys.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.car.entity.CarEntity;
import com.oasys.car.repository.CarRepository;
import com.oasys.carnotfoundexception.CarNotFoundException;

@Service
public class CarService {
	
	@Autowired
	CarRepository carRepository;

	//public CarEntity getById(int id) throws CarNotFoundException {
	//	return carRepository.findById(id).orElseThrow(()->new CarNotFoundException());
	//}
	
	public String addcar(CarEntity carEntity) {
		carRepository.save(carEntity);
		return "Saved successfylly";
	}
	
	public List<CarEntity> getCarWithEngine(){
		return carRepository.getCarWithEngine();
	}
}



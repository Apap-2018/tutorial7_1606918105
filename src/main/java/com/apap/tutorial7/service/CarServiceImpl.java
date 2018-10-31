package com.apap.tutorial7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.apap.tutorial7.model.CarModel;
import com.apap.tutorial7.repository.CarDb;

@Service
@Transactional
public class CarServiceImpl implements CarService {
	@Autowired
	private CarDb carDb;
	
	@Override 
	public void addCar (CarModel car) {
		carDb.save(car);
	}
	
	@Override 
	public void deletCar(long id) {
		carDb.deleteById(id);
	}
	
	
	
	
}

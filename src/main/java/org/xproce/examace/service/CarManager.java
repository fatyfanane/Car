package org.xproce.examace.service;

import org.springframework.stereotype.Service;
import org.xproce.examace.dao.entities.Car;
import org.xproce.examace.dao.repositories.CarRepository;
import org.xproce.examace.dto.CarDTO;
import org.xproce.examace.mapper.CarMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarManager implements CarService{
    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public CarManager(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }


    @Override
    public CarDTO saveCar(CarDTO carDTO) {
        Car car = carMapper.fromCarDTOToCar(carDTO);
        Car savedCar = carRepository.save(car);
        return carMapper.fromCarToCarDTO(savedCar);
    }
    @Override
    public void saveCars(List<CarDTO> carDTOs) {
        List<Car> cars = carDTOs.stream()
                .map(carMapper::fromCarDTOToCar)
                .collect(Collectors.toList());
        carRepository.saveAll(cars);}

    @Override
    public List<CarDTO> getCarByModel(String model) {
        return carRepository.findByModel(model)
                .stream()
                .map(carMapper::fromCarToCarDTO)
                .collect(Collectors.toList());
    }
    }

 
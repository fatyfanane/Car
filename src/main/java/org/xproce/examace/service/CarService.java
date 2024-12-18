package org.xproce.examace.service;

import org.xproce.examace.dao.entities.Car;
import org.xproce.examace.dto.CarDTO;

import java.util.List;

public interface CarService {
    CarDTO saveCar(CarDTO carDTO);
    void saveCars(List<CarDTO> carDTOs);
     List<CarDTO> getCarByModel(String model);


}

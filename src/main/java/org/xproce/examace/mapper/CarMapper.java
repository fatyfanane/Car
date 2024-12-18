package org.xproce.examace.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.xproce.examace.dao.entities.Car;
import org.xproce.examace.dto.CarDTO;

@Component
public class CarMapper {
    public final ModelMapper mapper = new ModelMapper();
    public Car fromCarDTOToCar(CarDTO carDTO){
        return mapper.map(carDTO, Car.class);

    }
    public CarDTO fromCarToCarDTO(Car car){
        return mapper.map(car, CarDTO.class);

    }





}

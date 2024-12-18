package org.xproce.examace.web;

import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.xproce.examace.dto.CarDTO;
import org.xproce.examace.service.CarService;

import java.util.List;

@Controller
public class CarGraphQLController {

    private final CarService carService;

    public CarGraphQLController(CarService carService) {
        this.carService = carService;
    }

    @QueryMapping
    public List<CarDTO> getCarByModel( String model) {
        return carService.getCarByModel(model);
    }

    @MutationMapping
    public CarDTO saveCar( CarDTO car) {
        return carService.saveCar(car);
    }
}

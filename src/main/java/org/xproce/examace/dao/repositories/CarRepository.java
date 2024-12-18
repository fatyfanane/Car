package org.xproce.examace.dao.repositories;

import ch.qos.logback.core.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.examace.dao.entities.Car;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Long> {
    public List<Car> findByModel(String model);

}


package org.xproce.examace;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xproce.examace.dto.CarDTO;
import org.xproce.examace.service.CarService;

import java.util.List;

@SpringBootApplication
public class ExamAceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamAceApplication.class, args);
	}
@Bean
	CommandLineRunner start(CarService carService){
	return args -> {
		carService.saveCars(
				List.of(
						CarDTO.builder().model("Gt3rs").matricul("Porsche").color("Pink").price(79999.99f).build(),
						CarDTO.builder().model("M5").matricul("BMW").color("Black").price(65000.00f).build(),
						CarDTO.builder().model("A3").matricul("AUDI").color("Black").price(45000.50f).build(),
						CarDTO.builder().model("gt500").matricul("Mustang").color("White").price(25000.00f).build()
				)
		);
	};
}
}

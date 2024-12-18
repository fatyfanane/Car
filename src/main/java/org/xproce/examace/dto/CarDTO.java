package org.xproce.examace.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CarDTO {
    private String model;
    private String color;
    private String matricul;
    private Float price;
}

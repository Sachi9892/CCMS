package com.customize_college_management.dto;

import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LabsDto {

    @PositiveOrZero(message = "no of labs cannot be less then 0")
    private int noOfLabs;
    
}

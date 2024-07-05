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
public class GroundDto {

    @PositiveOrZero(message = "Numbers of ground can't be less then 0")
    private int noOfGrounds;
}

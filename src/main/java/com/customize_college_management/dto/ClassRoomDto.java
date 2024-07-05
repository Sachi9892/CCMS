package com.customize_college_management.dto;

import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClassRoomDto {

    @PositiveOrZero(message = "Numbers of classroom can't be less then 0")
    private int noOfClassRooms;
    
}

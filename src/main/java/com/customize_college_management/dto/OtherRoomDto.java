package com.customize_college_management.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OtherRoomDto {
    
    @NotBlank(message = "Enter name of the room")
    private String nameOfOtherRoom;

    @PositiveOrZero(message = "Room count can't be less then 0")
    private int noOfOtherRooms;
}

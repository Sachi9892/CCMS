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
public class FloorDto {

    private String floorName;

    @PositiveOrZero(message = "Class rooms list cannot be 0 or less")
    private int noOfClassRooms;

    @PositiveOrZero(message = "Labs list cannot be 0 or less")
    private int noOfLabs;

    @PositiveOrZero(message = "Auditarium list cannot be 0 or less")
    private int noOfAuditarium;

    @PositiveOrZero(message = "Other rooms list cannot be 0 or less")
    private int noOfOtherRooms;
}

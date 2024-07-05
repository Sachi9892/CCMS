package com.customize_college_management.dto;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CollegeDto {

    @NotBlank(message = "College Name Cannot Be Empty")
    private String collegeName;

    @NotNull(message = "List of floors cannot be null")
    private List<FloorDto> floors;

    @NotNull(message = "List of faculties cannot be null")
    private List<FacultyDto> faculties;

    @NotNull(message = "List of crs cannot be null")
    List<CrDto> crs;

}

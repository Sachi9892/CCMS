package com.customize_college_management.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FacultyDto {

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "Enter proper mobile number")
    private String mobileNumber;

    @Email(message = "Enter proper mail")
    private String email;

}

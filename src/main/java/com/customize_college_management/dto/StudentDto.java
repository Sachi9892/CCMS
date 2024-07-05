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
public class StudentDto {
    
    @NotBlank(message = "Roll No cannot be blanked")
    private int rollNo;

    @NotBlank
    private String name;

    @NotBlank
    @NotBlank(message = "Enter proper mobile number")
    private String mobileNumber;


    @Email(message = "Enter valid email id")
    private String email;
}

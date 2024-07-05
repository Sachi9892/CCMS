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
public class CrDto {

    @NotBlank(message = "Name cannot be blank")
    private String crName;

    @NotBlank(message = "Roll no cannot be null")
    private int rollNo;

    @NotBlank(message = "Mobile number Cannot be blanked")
    private String mobileNumber;

    @Email
    private String email;

    @NotBlank(message = "Coordinator email cannot be empty")
    @Email(message = "Enter proper coordinator email")
    private String coordinatorEmail;


    @NotBlank(message = "Coordinator mobile number cannot be empty")
    private String coordinatMobileNumber;
}

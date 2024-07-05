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
public class AuditoriumDto {
 
    @PositiveOrZero(message = "Number of auditarium cannot be less then 0")
    private int noOfAuditarium;
    
}

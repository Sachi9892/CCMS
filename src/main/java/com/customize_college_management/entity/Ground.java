package com.customize_college_management.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "Grounds")
@Getter     @Setter     @AllArgsConstructor     @NoArgsConstructor      @ToString
public class Ground {
    
    @Id
    private int grounId;

    private String name;

    private boolean isGroundBooked = false;

    
    @ManyToOne
    @JoinColumn(name = "collegeId")
    private College college;
}

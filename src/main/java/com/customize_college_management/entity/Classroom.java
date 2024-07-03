package com.customize_college_management.entity;

import org.springframework.data.mongodb.core.mapping.Document;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "Classrooms")
@AllArgsConstructor  @NoArgsConstructor  @Getter  @Setter
public class Classroom {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String className;

    private boolean isOccupied = false;

    private boolean isBookedByFaculty = false;

    private boolean isBookedByCr = false;


    @ManyToOne
    @JoinColumn(name = "floorId")
    private Floor floor;

    
    @ManyToOne
    @JoinColumn(name = "collegeId")
    private College college;
    
}

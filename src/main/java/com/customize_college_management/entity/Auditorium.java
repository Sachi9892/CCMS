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

@Document(collection = "Auditorium")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Auditorium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String audiName;

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

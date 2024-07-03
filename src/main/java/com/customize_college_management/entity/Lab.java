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

@Document(collection = "Labs")
@AllArgsConstructor  @NoArgsConstructor  @Getter  @Setter  @ToString
public class Lab {
    
    @Id
    private int labId;

    private String labName;

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

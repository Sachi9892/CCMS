package com.customize_college_management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Lab {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int labId;

    private String labName;

    private boolean isOccupied = false;

    private boolean isBookedByFaculty = false;

    private boolean isBookedByCr = false;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "floorId")
    private Floor floor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "collegeId")
    private College college;

    
    public Lab(String labName , Floor floor) {
        this.labName = labName;
        this.floor = floor;
    }
}

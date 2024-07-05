package com.customize_college_management.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
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

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collegeId")
    private College college;


    public Classroom(String className, Floor floor) {
        this.className = className;
        this.floor = floor;
    }

    
    
}

package com.customize_college_management.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Auditorium {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int audiId;

    private String audiName;

    private boolean isOccupied = false;

    private boolean isBookedByFaculty = false;

    private boolean isBookedByCr = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "floorId")
    private Floor floor;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collegeId")
    private College college;


    public Auditorium(String audiName , Floor floor) {
        this.audiName = audiName;
        this.floor = floor;
    }
}

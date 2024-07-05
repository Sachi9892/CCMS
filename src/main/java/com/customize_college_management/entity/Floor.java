package com.customize_college_management.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Floor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int floorId;

    private String floorName;

    @OneToMany(mappedBy = "floor", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Classroom> classrooms = new ArrayList<>();

    @OneToMany(mappedBy = "floor", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Auditorium> auditoriums = new ArrayList<>();

    @OneToMany(mappedBy = "floor", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Lab> labs = new ArrayList<>();

    @OneToMany(mappedBy = "floor", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<OtherRoom> otherRooms = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collegeId")
    private College college;


    public void addClassRooms(Classroom classroom) {
        
        this.classrooms.add(classroom);
        classroom.setFloor(this);

    }


    public void addLabs(Lab lab) {

        this.labs.add(lab);
        lab.setFloor(this);

    }


    public void addAudi(Auditorium audi) {

        this.auditoriums.add(audi);
        audi.setFloor(this);

    }


    public void addOtherRooms(OtherRoom room) {

        this.otherRooms.add(room);
        room.setFloor(this);

    }

}

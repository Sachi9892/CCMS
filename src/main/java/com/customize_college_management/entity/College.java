package com.customize_college_management.entity;

import java.util.List;

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
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long collegeId;

    private String collegeName;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Floor> noOfFloors;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Classroom> noOfClassrooms;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Auditorium> noOfAuditoriums;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Ground> noOfGrounds;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Faculty> faculties;

    // private boolean isFacultyCordinator = false;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Student> students;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Lab> noOfLabs;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<CR> Crs;

}

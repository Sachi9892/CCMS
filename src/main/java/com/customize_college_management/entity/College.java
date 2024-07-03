package com.customize_college_management.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "colleges")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class College {

    @Id
    private Long collegeId;

    private String collegeName;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<Floor> noOfFloors;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<Classroom> noOfClassrooms;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<Auditorium> noOfAuditoriums;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<Ground> noOfGrounds;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<Faculty> faculties;

    // private boolean isFacultyCordinator = false;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<Student> students;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<Lab> noOfLabs;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<CR> Crs;

}

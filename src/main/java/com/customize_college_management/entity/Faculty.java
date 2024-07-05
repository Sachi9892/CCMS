package com.customize_college_management.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int faculty_id;

    private String facultyName;

    private String mobileNumber;

    private String email;

    private boolean isFacultyVerified = false;

    private boolean isFacultyBookedClassroom = false;

    private boolean isClassroomBookingVerifiedByFaculty = false;

    private boolean isCrVerifiedByFaculty = false;

    @OneToMany(mappedBy = "co_ordinator", cascade = CascadeType.ALL)
    private List<CR> crs;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collegeId")
    private College college;

}

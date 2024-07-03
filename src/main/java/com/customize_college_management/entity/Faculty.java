package com.customize_college_management.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection = "Faculties")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Faculty {

    @Id
    private int faculty_id;

    private String facultyName;

    private boolean isFacultyVerified = false;

    private boolean isFacultyBookedClassroom = false;

    private boolean isClassroomBookingVerifiedByFaculty = false;

    private boolean isCrVerifiedByFaculty = false;

    @OneToMany(mappedBy = "co_ordinator", cascade = CascadeType.ALL)
    private List<CR> crs;

    
    @ManyToOne
    @JoinColumn(name = "collegeId")
    private College college;

}

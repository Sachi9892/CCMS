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
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    private int rollNo;

    private String studentName;

    private String mobileNumber;

    private String studentEmail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collegeId")
    private College college;
}

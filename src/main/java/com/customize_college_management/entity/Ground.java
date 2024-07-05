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
public class Ground {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int groundId;

    private String name;

    private boolean isGroundBooked = false;

    private boolean isBookedByFaculty = false;

    private boolean isBookedByCr = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collegeId")
    private College college;
}

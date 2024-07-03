package com.customize_college_management.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "Students")
@AllArgsConstructor     @NoArgsConstructor     @Getter    @Setter     @ToString
public class Student {
    
    @Id
    private int rollNo;

    private String name;

    private String mobileNumber;

    private String email;

    @ManyToOne
    @JoinColumn(name = "collegeId")
    private College college;
}

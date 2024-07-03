package com.customize_college_management.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "Floors")
@Setter     @Getter     @AllArgsConstructor     @NoArgsConstructor      @ToString
public class Floor {
    
    @Id
    private int floorId;

    private String floorName;

    @OneToMany(mappedBy = "floor", cascade = CascadeType.ALL)
    private List<Classroom> classrooms;

    @OneToMany(mappedBy = "floor", cascade = CascadeType.ALL)
    private List<Auditorium> auditoriums;

    @OneToMany(mappedBy = "floor", cascade = CascadeType.ALL)
    private List<Lab> labs;

    @OneToMany(mappedBy = "floor", cascade = CascadeType.ALL)
    private List<OtherRoom> otherRooms;

    
    @ManyToOne
    @JoinColumn(name = "collegeId")
    private College college;
}

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

@Document(collection = "Other_Rooms")
@AllArgsConstructor     @NoArgsConstructor    @Getter     @Setter   @ToString
public class OtherRoom {
    
    @Id
    private int otherRoomId;

    private String otherRoomName;

    private boolean isOccupied = false;

    private boolean isBookedByFaculty = false;

    private boolean isBookedByCr = false;

    @ManyToOne
    @JoinColumn(name = "floorId")
    private Floor floor;

    
    @ManyToOne
    @JoinColumn(name = "collegeId")
    private College college;
}

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
public class OtherRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int otherRoomId;

    private String otherRoomName;

    private boolean isOccupied = false;

    private boolean isBookedByFaculty = false;

    private boolean isBookedByCr = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "floorId")
    private Floor floor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collegeId")
    private College college;


    public OtherRoom(String otherRoomName , Floor floor) {
        this.otherRoomName = otherRoomName;
        this.floor = floor;
    }
}

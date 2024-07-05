package com.customize_college_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CR extends Student {

    private boolean isCrVerified = false;

    private String courseName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "co_ordinator")
    private Faculty co_ordinator;

}

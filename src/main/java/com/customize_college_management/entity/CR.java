package com.customize_college_management.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "Class_Representative")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CR extends Student {

    private boolean isCrVerified = false;

    @ManyToOne
    @JoinColumn(name = "co_ordinator")
    private Faculty co_ordinator;

}

package com.customize_college_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customize_college_management.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty , Integer> {

    
    Faculty findByEmail(String email);
    
}

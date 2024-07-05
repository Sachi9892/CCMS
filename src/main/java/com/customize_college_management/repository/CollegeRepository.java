package com.customize_college_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.customize_college_management.entity.College;

public interface CollegeRepository extends JpaRepository<College , Long> {

//    //Get college
//    College  findById(int id);
}

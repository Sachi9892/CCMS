package com.customize_college_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.customize_college_management.dto.CollegeDto;
import com.customize_college_management.service.CollegeService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/college")
public class CollegeController {

    private CollegeService collegeService;

     @PostMapping("/register")
    public void registerCollege(@RequestBody CollegeDto collegeDto) {
        collegeService.registerCollege(collegeDto);
    }

    
}

package com.customize_college_management.controller;

import com.customize_college_management.service.serviceiml.CustomMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/verify")
public class OtpVerificationController {

    @Autowired
    private CustomMailSender mailSender;

    @PostMapping("/mail")
    @ResponseBody
    public String sendMail(@RequestParam String to) {

        mailSender.sendMail(to);

        return "Mail sent successfully";

    }

}

package com.customize_college_management.service.serviceiml;

import com.customize_college_management.helpers.OtpGenerators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class CustomMailSender {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String sender;

    public void sendMail(String to) {

        String otp = OtpGenerators.getOTP(6);
        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setFrom(sender);

        mailMessage.setTo(to);

        mailMessage.setSubject("Welcome to the customize college management system");

        mailMessage.setText("To verify as a student of L S Raheja college" +
                "Enter Otp : " + otp + "\n -Team College Management System");

        mailSender.send(mailMessage);

    }



}

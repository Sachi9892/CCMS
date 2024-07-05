package com.customize_college_management.helpers;

import java.security.SecureRandom;

public class OtpGenerators {

    private static final String DIGITS = "0123456789";
    private static final SecureRandom random = new SecureRandom();

    private static String generateOTP(int length) {
        StringBuilder otp = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            otp.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        }
        return otp.toString();
    }

    public static String getOTP(int length) {
        return generateOTP(length);
    }
}

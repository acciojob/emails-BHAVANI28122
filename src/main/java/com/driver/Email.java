package com.driver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    private String emailId;
    private String password;

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Email(String emailId) {
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword) {
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if (oldPassword.equals(this.password)) {
            if (newPassword.length() >= 8 && newPassword.matches(".*[A-Z].*") &&
                    newPassword.matches(".*[a-z].*") && newPassword.matches(".*[0-9].*") &&
                    newPassword.matches(".*[^A-Za-z0-9].*")) {

                this.password = newPassword;


            }

        }
    }
}
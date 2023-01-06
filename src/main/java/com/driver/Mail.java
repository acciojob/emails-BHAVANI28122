package com.driver;

import java.util.Date;

public class Mail {
    Date date;
    String sender;
    String message;

    Mail(Date date, String sender, String message) {
        this.date = date;
        this.sender = sender;
        this.message = message;
    }
}

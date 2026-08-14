package com.example.spdemo2;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
    public void displayMessage(){
        System.out.println("Hello from MessageService");
    }
}

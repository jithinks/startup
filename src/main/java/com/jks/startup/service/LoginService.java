package com.jks.startup.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public LoginService(){
        System.out.println("******Initialized LoginService bean..");


    }
    public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("d") && password.equals("t");
    }

}
package com.jks.startup.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public LoginService(){
        System.out.println("******Initialized LoginService bean..");


    }
    public boolean validateUser(String user, String password) {
        return StringUtils.equals(user, "user") && StringUtils.equals(password, "pass");
    }

}
package com.sparta.jka.services;

import com.sparta.jka.components.User;

import javax.inject.Named;

@Named
public class LoginService {


    public String validateUser(User user) {
        if (user.getUserName().equals("Jan") && user.getPassword().equals("password")){
            return "welcome";
        }  return "error";
    }


}

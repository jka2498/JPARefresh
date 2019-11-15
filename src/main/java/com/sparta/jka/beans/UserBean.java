package com.sparta.jka.beans;


import com.sparta.jka.components.User;
import com.sparta.jka.services.LoginService;
import com.sparta.jka.services.RegistrationService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class UserBean {

    @Inject
    private RegistrationService registrationService;
    @Inject
    private LoginService loginService;
    private User user = new User();

    public User getUser() {
        return user;
    }

    public String registerNewUser(){

        return registrationService.registerUser(user);

    }


    public String validateUser(){
        return loginService.validateUser(user);
    }
}

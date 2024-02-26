package com.springboot.action.services;

import org.springframework.stereotype.Service;

@Service
public class AuthenticateServices {

    public Boolean authenticate(String name, String password) {

        Boolean isValidUserName = name.equalsIgnoreCase("faraz");
        Boolean isValidPassword = password.equalsIgnoreCase("khan");

        Boolean result = isValidUserName && isValidPassword;

        return result;
    }

}

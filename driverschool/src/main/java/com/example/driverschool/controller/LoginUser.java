package com.example.driverschool.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/loginUser" )
public class LoginUser {

    @GetMapping( "/user" )
    public void verifyUser ( ) {
        try {

        } catch ( Exception e ) {

        }
    }
}

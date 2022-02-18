package com.example.springboot.telefonia.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/login")
public class AuthenticateRest {

    @PostMapping(value = "/authenticate")
   public String sendAuthenticateRest(@RequestParam("key") String Key, @RequestParam("token") String Token) {

            return "key " + Key+ "token " + Token + "";

        }

}
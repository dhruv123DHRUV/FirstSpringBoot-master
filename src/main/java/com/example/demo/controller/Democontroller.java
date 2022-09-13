package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class Democontroller {

   @GetMapping("/")
    public String welcomeMessage(){
       return "Welcome";
   }
   @GetMapping("/getDate")
    public Date getDate (){
       return new Date();
   }


}

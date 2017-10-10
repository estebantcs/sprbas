package com.scpma.spcbas.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {

    @RequestMapping("/")
    public String LogIn(){
        return "LogIn";
    }


}

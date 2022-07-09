package com.example.dalycodeapp.Controller;


import com.example.dalycodeapp.ServiceApps.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/apps")
public class ControllerApps {

    private UserService userService;


    public ControllerApps(UserService userService) {
        this.userService = userService;
    }







}

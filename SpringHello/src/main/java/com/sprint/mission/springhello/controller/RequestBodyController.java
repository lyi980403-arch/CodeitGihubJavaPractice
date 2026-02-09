package com.sprint.mission.springhello.controller;

import com.sprint.mission.springhello.UserRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestBodyController {
    @PostMapping("/users")
    @ResponseBody
    public String create(@RequestBody UserRequest request){
        return "name=" + request.getName() + ", age=" + request.getAge();
    }
}

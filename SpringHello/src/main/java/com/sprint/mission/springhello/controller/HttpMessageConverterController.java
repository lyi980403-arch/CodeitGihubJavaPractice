package com.sprint.mission.springhello.controller;

import com.sprint.mission.springhello.dto.MemberDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HttpMessageConverterController {
    @GetMapping(value = "/v1/members/json/{id}", produces = "application/json")
    @ResponseBody
    public MemberDto getMemberJson(@PathVariable long id) {
        return new MemberDto(id, "test@example.com", "홍길동", "010-1234-1234");
    }
}


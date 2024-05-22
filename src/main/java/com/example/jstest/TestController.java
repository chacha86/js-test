package com.example.jstest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "{\"data\" : \"test123123\"}";
    }
}

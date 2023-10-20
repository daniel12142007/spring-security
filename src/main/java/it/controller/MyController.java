package it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String hello() {
        return "menu";
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return "a";
    }

    @GetMapping("/user")
    public String helloUser() {
        return "u";
    }
    @GetMapping("/time")
    public String time() {
        return "time";
    }
}
package com.example.msasecondservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-service")
public class SecondController {

    @GetMapping("/welcome")
    public String greeting() {
        return "second controller.";
    }

    @GetMapping("/header")
    public String header(@RequestHeader("second-request") String header) {
        return header + " second controller.";
    }

    @GetMapping("/check")
    public String check() {
        return "check from second controller.";
    }
}

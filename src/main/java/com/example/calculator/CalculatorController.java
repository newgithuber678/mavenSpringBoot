package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorController {
    @GetMapping
    public String hello(){
        return "hello";
    }
}

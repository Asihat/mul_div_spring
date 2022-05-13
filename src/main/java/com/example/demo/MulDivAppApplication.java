package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MulDivAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MulDivAppApplication.class, args);
    }

    @GetMapping("/mul")
    public String mul(@RequestParam(value = "name", defaultValue = "World") String name,
                      @RequestParam(value = "first", defaultValue = "error") String first,
                      @RequestParam(value = "second", defaultValue = "error") String second) {
        if(first.equals("error") || second.equals("error")) {
            return "Enter values";
        }
        double a = Integer.parseInt(first);
        double b = Integer.parseInt(second);
        double result = a * b;
        return String.valueOf(result);
    }

    @GetMapping("/div")
    public String div(@RequestParam(value = "name", defaultValue = "World") String name,
                      @RequestParam(value = "first", defaultValue = "error") String first,
                      @RequestParam(value = "second", defaultValue = "error") String second) {
        if(first.equals("error") || second.equals("error")) {
            return "Enter values";
        }
        double a = Integer.parseInt(first);
        double b = Integer.parseInt(second);
        double result = a / b;
        return String.valueOf(result);
    }
}

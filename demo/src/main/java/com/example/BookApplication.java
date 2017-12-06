package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BookApplication {

    @RequestMapping(value = "/available/a")
    public String available() {
        return "Spring in Action";
    }
    @RequestMapping(value = "/wangyi")
    public void wangyi() {
    	System.out.println("转发到网易");
    }
    @RequestMapping(value = "/home")
    public String home() {
    	return "home";
    }
    @RequestMapping(value = "/available")
    public String availableOne() {
        return "Spring in Action";
    }

    @RequestMapping(value = "/checked-out/checked")
    public String checkedOut() {
        return "Spring Boot in Action";
    }

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }
}

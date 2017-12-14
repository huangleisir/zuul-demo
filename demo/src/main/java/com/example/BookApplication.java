package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BookApplication {

    @RequestMapping(value = "/api/book2/available/a")
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
    	System.out.println(System.currentTimeMillis());
        return "Spring in Action";
    }

//http://localhost:8080/api/rest/abc 
//将demo2里面的zuul.routes.book.stripPrefix=true toggle切换为false试试看
    //true表示从星号开始匹配  
    /**
zuul.prefix=/api true还是false跟这个没关系，他是来设置是否从/rest开始匹配（.path值跟controller路径映射值，从
.path值的哪里开始跟controller路径映射匹配非常关键）
 false从/rest开始匹配 默认为true，
从星号开始匹配 所以此时请求/abc
zuul.routes.book.stripPrefix=true 
zuul.routes.book.path=/rest/*
zuul.routes.book.url=http://localhost:8090
     */
    @RequestMapping(value = "/rest/abc")
    public String restAbc() {
        return "restAbc";
    }
    
    @RequestMapping(value = "/abc")
    public String abc() {
        return "abc";
    }

    @RequestMapping(value = "/checked-out/checked")
    public String checkedOut() {
        return "Spring Boot in Action";
    }

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }
}

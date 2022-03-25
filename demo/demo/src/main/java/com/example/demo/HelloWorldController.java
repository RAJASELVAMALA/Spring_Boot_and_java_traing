package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
    @Controller
    public class HelloWorldController
    {

        @GetMapping("/greeting")              //http://localhost:8080/greeting
        @ResponseBody
        public String greeting()
        {
            return "Good Evening to all";
        }
    }


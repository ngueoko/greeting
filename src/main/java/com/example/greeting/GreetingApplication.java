package com.example.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GreetingApplication {

    @GetMapping("/greeting/{name}")
    public String greetingFunc(@PathVariable("name") String name){
        return "Greeting :"+name;
    }
    public static void main(String[] args) {
        SpringApplication.run(GreetingApplication.class, args);
    }

}

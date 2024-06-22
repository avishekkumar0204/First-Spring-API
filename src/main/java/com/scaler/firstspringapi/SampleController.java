package com.scaler.firstspringapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

// API request coming from localhost:8080/sample will come to this controller
@RequestMapping("/sample")
public class SampleController {

    // Request:: localhost:8080/sample
    @GetMapping("/sayhello")
    public String sayHelloToEveryone() {
        return "Hello Everyone";
    }
    // Request:: localhost:8080/sample/avishek
    @GetMapping("/sayhello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    // Request:: localhost:8080/sample/saybye
    @GetMapping("/saybye")
    public String sayBye(){
        return "Bye Everyone";
    }
}

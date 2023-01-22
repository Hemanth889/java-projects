package com.example.plus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @GetMapping(value = "/")
    public String demoMethod() {

        return "bike xlpus";
    }

}

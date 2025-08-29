package com.example.demoProject1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Contoller3 {
    @GetMapping("/Hello")
    public String Show3(){
        return "Page3";
    }

}

package com.fastcam.cicd01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController {

    @GetMapping("/")
    public String index(){
        return "<h1>똥머거!!!!</h1>";
    }
}

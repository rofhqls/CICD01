package com.fastcam.cicd01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController {

    @GetMapping("/")
    public String index(){
        return "<h1>수정이 됐을까 안됐을까~</h1>";
    }
}

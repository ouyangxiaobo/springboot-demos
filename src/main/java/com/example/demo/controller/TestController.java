package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @ClassName
 * @Decription TOO
 * @Author HanniOvO
 * @Date 2019/8/23 11:27
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "ok.......";
    }
}

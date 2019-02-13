package com.example.springmvc2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @RequestMapping("/hello") //hello라는 이름으로 요청
    @ResponseBody
    public String hello(){
        return "hello"; //뷰이름
    }
}

package com.example.response.controller;


import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main()
    {
        return "main.html";
    } //컨트롤러 어너테이션은  스트링 리턴이면 리소스를 받는다.

    //ResponseEntit
    @ResponseBody
    @GetMapping("/user")
    public User user()
    {
        User user =new User();
        //var user =new User();
        //java 11 에서 추가 됬고, 타입을 추론하는 단춧어임ㄴ
        user.setName("steve");
        user.setAddress("패스트캠퍼스");
        return user;

    }
    //리스펀스바디 어너테이션은 객체가 리턴이면 말그대로 리스펀스바디를 만들어서 내리는 어노테이션


}

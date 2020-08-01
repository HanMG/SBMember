package com.practice.basic.controller;

import com.practice.basic.dto.form.LoginForm;
import com.practice.basic.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    private final MemberService memberService;

    @Autowired
    public LoginController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 로그인
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    // 로그아웃
    @GetMapping("/logout")
    public void logout(HttpSession session)throws Exception {

    }
}

package com.practice.basic.controller;

import com.practice.basic.dto.MemberDto;
import com.practice.basic.dto.form.MemberForm;
import com.practice.basic.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 회원가입
    @GetMapping("/members/join")
    public String getJoin(){
        return "members/join";
    }

    @PostMapping("/members/join")
    public String postJoin(Model model, MemberForm memberForm) throws Exception {
        // 이메일 조회
        int validate = 1;
        // 중복체크
        validate = memberService.validateToEmail(memberForm);
        System.out.println(memberForm.toString());
        System.out.println(validate);
        // 이메일이 없으면
        if( validate == 0){
            memberService.insertMember(memberForm);
            model.addAttribute("result", "1");
        }
        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(){
        return "members/list";
    }

    // 이름조회
    @GetMapping("/members/{name}")
    @ResponseBody
    public List<MemberDto> getOne(@PathVariable("name") String name) throws Exception {
        List<MemberDto> members = memberService.getMember(name);
        return members;
    }


    // 전체조회
    @GetMapping("/members/all")
    @ResponseBody
    public List<MemberDto> getList() throws Exception {
        List<MemberDto> members = memberService.getMemberList();
        return members;
    }



}

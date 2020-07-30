package com.practice.basic.controller;

import com.practice.basic.dto.MemberDto;
import com.practice.basic.dto.MemberForm;
import com.practice.basic.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/join")
    public String getJoin(){
        return "members/join";
    }

    @PostMapping("/members/join")
    public String postJoin(MemberForm memberForm) throws Exception {
        memberService.insertMember(memberForm);
        return "redirect:/";
    }

    @GetMapping("/members")
    public String getList(Model model) throws Exception {
        List<MemberDto> members = memberService.getMemberList();
        model.addAttribute("members",members);
        return "members/list";
    }

}

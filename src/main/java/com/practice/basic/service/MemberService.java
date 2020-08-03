package com.practice.basic.service;

import com.practice.basic.dto.MemberDto;
import com.practice.basic.dto.form.MemberForm;
import com.practice.basic.repository.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public void insertMember(MemberForm memberForm) throws Exception{
        memberMapper.insertMember(memberForm);
    }

    public List<MemberDto> getMemberFromName(String name) throws Exception{
        return memberMapper.getMemberFromName(name);
    }

    public List<MemberDto> getMemberList() throws Exception {
        return memberMapper.getMemberList();
    }

    public int validateToEmail(MemberForm memberForm) throws Exception{
        return memberMapper.validateToEmail(memberForm);
    }

    public int updateMember(MemberDto memberDto) throws Exception {
        return memberMapper.updateMember(memberDto);
    }

    public MemberDto getMemberFromId(String id) throws Exception {
        return memberMapper.getMemberFromId(id);
    }
}

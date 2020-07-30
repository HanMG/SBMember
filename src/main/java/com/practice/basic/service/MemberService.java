package com.practice.basic.service;

import com.practice.basic.dto.MemberDto;
import com.practice.basic.dto.MemberForm;
import com.practice.basic.repository.MainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MainMapper mainMapper;

    public void insertMember(MemberForm memberForm) throws Exception{
        mainMapper.insertMember(memberForm);
    }

    public List<MemberDto> getMemberList() throws Exception {
        return mainMapper.getMemberList();
    }
}

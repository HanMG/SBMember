package com.practice.basic.repository;

import com.practice.basic.dto.MemberDto;
import com.practice.basic.dto.form.MemberForm;

import java.util.List;

public interface MemberMapper {

    void insertMember(MemberForm memberForm) throws Exception;

    List<MemberDto> getMember(String name) throws Exception;

    List<MemberDto> getMemberList() throws Exception;

    int validateToEmail(MemberForm memberForm) throws Exception;
}

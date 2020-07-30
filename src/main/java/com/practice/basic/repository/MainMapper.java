package com.practice.basic.repository;

import com.practice.basic.dto.MemberDto;
import com.practice.basic.dto.MemberForm;

import java.util.List;

public interface MainMapper {

    public void insertMember(MemberForm memberForm) throws Exception;

    public List<MemberDto> getMemberList() throws Exception;
}

package com.practice.basic.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MemberDto {

    private Long id;

    private String email;

    private String password;

    private String name;

    private Date joindate;

    private Date editdate;
}

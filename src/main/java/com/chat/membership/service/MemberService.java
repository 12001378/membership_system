package com.chat.membership.service;

import com.chat.membership.payload.MemberDTO;

import java.util.List;

public interface MemberService {

    public void create(MemberDTO memberDTO) throws Exception;
    public List<MemberDTO> getAllMembers() throws Exception;
}

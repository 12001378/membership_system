package com.chat.membership.Mapper;

import com.chat.membership.entity.Member;
import com.chat.membership.payload.MemberDTO;

public class MemberMapper {

    public static MemberDTO  toMap(Member member){

        MemberDTO memberDTO = new MemberDTO();

        memberDTO.setMemberEmail(member.getMemberEmail());
        memberDTO.setMemberMobile(memberDTO.getMemberMobile());
        memberDTO.setMemberFirstName(member.getMemberFirstName());
        memberDTO.setMemberLastName(member.getMemberLastName());
        memberDTO.setMembershipId(member.getMembershipID());

        return memberDTO;
    }
}

package com.chat.membership.payload;

import lombok.Data;

import java.util.UUID;

@Data
public class MemberDTO {
    private UUID memberID;
    private String memberFirstName;
    private String memberLastName;
    private String memberEmail;
    private String memberMobile;
    private UUID membershipId;
}

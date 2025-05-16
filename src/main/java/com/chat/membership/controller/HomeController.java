package com.chat.membership.controller;

import com.chat.membership.entity.Member;
import com.chat.membership.repository.MemberRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final MemberRepository memberRepository;


    @GetMapping("/")
    public String allMembers(Model model){

        List<Member> member = memberRepository.findAll().stream().toList();
        model.addAttribute("members",member);
        return "home";
    }

    @PostMapping("/members/add")
    public String addMembers(@ModelAttribute Member member, HttpServletRequest request){

        String firstname = request.getParameter("memberFirstName");
        String lastname = request.getParameter("memberLastName");
        String email = request.getParameter("memberEmail");
        String phone = request.getParameter("memberMobile");

        member.setMemberFirstName(firstname);
        member.setMemberLastName(lastname);
        member.setMembershipID(UUID.randomUUID());
        member.setMemberMobile(phone);
        member.setMemberEmail(email);

        memberRepository.save(member);

        return "redirect:/";
    }
}

package com.example.swaggerdemo.service;

import com.example.swaggerdemo.repository.MemberRepository;
import com.example.swaggerdemo.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public List<MemberVo> findAll() {
        List<MemberVo> members = new ArrayList<>();
        memberRepository.findAll().forEach(e -> members.add(e));
        return members;
    }

    public Optional<MemberVo> findById(Long no) {
        Optional<MemberVo> member = memberRepository.findById(no);
        return member;
    }

    public MemberVo save(MemberVo member) {
        return memberRepository.save(member);
    }


}

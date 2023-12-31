package com.example.jatanpung.member.controller;

import com.example.jatanpung.base.BaseResponse;
import com.example.jatanpung.dto.MemberReq;
import com.example.jatanpung.dto.MemberRes;
import com.example.jatanpung.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    //전체 회원 조회

    @GetMapping("/select")
    public BaseResponse<MemberRes.selectAllMember> selectAllMember(){
        MemberRes.selectAllMember result = memberService.selectAllMember();
        return BaseResponse.ok(HttpStatus.OK,"전체 회원 조회 성공", result);
    }

    @GetMapping("/select/{memberId}")
    public BaseResponse<MemberRes.selectOneMember> selectOneMemberByMemberId(@PathVariable String memberId){
        MemberRes.selectOneMember result = memberService.selectOneMemberByMemberId(memberId);
        System.out.println("controller result : " + result);
        return  BaseResponse.ok(HttpStatus.OK,"회원ID로 조회 성공", result);
    }

    @PostMapping("/insert")
    public BaseResponse<MemberRes.insertMember> insertMember(@RequestBody MemberReq.insertMemberReq info){
        System.out.println("controller insert info : " + info);
        memberService.insertMember(info);
        return BaseResponse.ok(HttpStatus.OK, "회원 정보 입력 성공");
    }

    @DeleteMapping("/delete/{memberId}")
    public BaseResponse<MemberRes.deleteMember> deleteMemberByMemberId(@PathVariable String memberId){
        memberService.deleteMemberByMemberId(memberId);
        return BaseResponse.ok(HttpStatus.OK,"회원ID로 삭제 성공");
    }

    //배포가 되는지???
}

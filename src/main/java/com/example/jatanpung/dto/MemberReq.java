package com.example.jatanpung.dto;

import com.example.jatanpung.domain.Member;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@ToString
public class MemberReq {

    @ToString
    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    public static class insertMemberReq{
        private Long memberCode;
        private String memberId;
        private String memberPw;
        private String memberName;
        private String memberPhone;
        private String memberEmail;
        private String memberManager;

        public Member toEntity(){
            return Member.builder().memberCode(memberCode).memberId(memberId).memberPw(memberPw).memberName(memberName)
                    .memberPhone(memberPhone).memberEmail(memberEmail).memberManager(memberManager).build();
        };
    }

    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    @ToString
    public static class deleteMemberReq{
        private String memberId;
    }

}

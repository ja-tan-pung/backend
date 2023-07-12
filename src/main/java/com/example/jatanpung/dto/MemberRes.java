package com.example.jatanpung.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
public class MemberRes {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class selectAllMember{
        private List<selectOneMember> selectAllMember;
    }

    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    public static class selectOneMember{
        private Long memberCode;
        private String memberId;
        private String memberPw;
        private String memberName;
        private String memberPhone;
        private String memberEmail;
        private String memberManager;
    }

    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    public static class insertMember{
        private Long memberCode;
        private String memberId;
        private String memberPw;
        private String memberName;
        private String memberPhone;
        private String memberEmail;
        private String memberManager;
    }

    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    public class deleteMember {
        private Long memberCode;
        private String memberId;
        private String memberPw;
        private String memberName;
        private String memberPhone;
        private String memberEmail;
        private String memberManager;
    }
}

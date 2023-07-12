package com.example.jatanpung.domain;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor @NoArgsConstructor
@Table(name="MEMBER_TBL")
@ToString
@Builder
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberCode;

    @Column
    private String memberId;
    @Column
    private String memberPw;
    @Column
    private String memberName;
    @Column
    private String memberPhone;
    @Column
    private String memberEmail;

    @Column(columnDefinition = "varchar2(5) default 'N'")
    private String memberManager;

    @PrePersist
    public void setMemberManager() {
        this.memberManager = this.memberManager == null? "N" : this.memberManager;
    }
}

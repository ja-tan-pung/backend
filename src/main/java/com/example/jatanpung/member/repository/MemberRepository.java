package com.example.jatanpung.member.repository;

import com.example.jatanpung.domain.Member;
import com.example.jatanpung.dto.MemberRes;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByMemberId(String memberId);

    @Transactional
    void deleteByMemberId(String memberId);
}

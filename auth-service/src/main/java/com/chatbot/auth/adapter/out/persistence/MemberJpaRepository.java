package com.chatbot.auth.adapter.out.persistence;

import com.chatbot.auth.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberJpaRepository extends JpaRepository<Member,Long> {
}

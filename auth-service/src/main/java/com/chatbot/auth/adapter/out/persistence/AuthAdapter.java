package com.chatbot.auth.adapter.out.persistence;

import com.chatbot.auth.application.port.out.SignUpPort;
import com.chatbot.auth.domain.Member;
import org.springframework.stereotype.Component;

@Component
public class AuthAdapter implements SignUpPort {
    @Override
    public boolean SignUp(Member member) {
        return false;
    }
}

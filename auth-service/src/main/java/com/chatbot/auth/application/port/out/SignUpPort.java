package com.chatbot.auth.application.port.out;

import com.chatbot.auth.domain.Member;

public interface SignUpPort {
    boolean SignUp(Member member);
}

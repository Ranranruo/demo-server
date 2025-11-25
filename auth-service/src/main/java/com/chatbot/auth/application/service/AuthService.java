package com.chatbot.auth.application.service;

import com.chatbot.auth.application.port.in.SignUpUseCase;
import com.chatbot.auth.application.port.in.command.SignUpCommand;
import com.chatbot.auth.application.port.out.SignUpPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService implements SignUpUseCase {
    private final SignUpPort signUpPort;

    @Override
    public boolean signUp(SignUpCommand command) {
        return false;
    }
}

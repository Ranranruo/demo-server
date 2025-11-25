package com.chatbot.auth.application.port.in;

import com.chatbot.auth.application.port.in.command.SignUpCommand;

public interface SignUpUseCase {
    boolean signUp(SignUpCommand command);
}

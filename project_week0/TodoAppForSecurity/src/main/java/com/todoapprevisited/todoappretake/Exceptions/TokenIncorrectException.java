package com.todoapprevisited.todoappretake.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class TokenIncorrectException extends AuthenticationException {

    public TokenIncorrectException(String msg, Throwable t) {
        super(msg, t);
    }

    public TokenIncorrectException(String msg) {
        super(msg);
    }
}
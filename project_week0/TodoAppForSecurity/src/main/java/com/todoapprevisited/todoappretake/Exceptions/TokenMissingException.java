package com.todoapprevisited.todoappretake.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class TokenMissingException extends AuthenticationException {

    public TokenMissingException(String msg, Throwable t) {
        super(msg, t);
    }

    public TokenMissingException(String msg) {
        super(msg);
    }
}
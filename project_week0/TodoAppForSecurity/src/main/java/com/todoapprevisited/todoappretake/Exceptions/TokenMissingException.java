package com.todoapprevisited.todoappretake.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "JWT Token missing")
public class TokenMissingException extends RuntimeException {
}
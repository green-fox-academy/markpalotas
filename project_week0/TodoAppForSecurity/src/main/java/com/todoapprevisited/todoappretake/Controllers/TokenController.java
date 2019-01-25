package com.todoapprevisited.todoappretake.Controllers;

import com.todoapprevisited.todoappretake.Model.JwtUser;
import com.todoapprevisited.todoappretake.Security.JwtGenerator;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser) {

        return jwtGenerator.generate(jwtUser);
    }

//    @ResponseStatus(value= HttpStatus.UNAUTHORIZED, reason="Unauthorized")
//    @ExceptionHandler(RuntimeException.class)
//    public void conflict() {
//        // Nothing to do
//    }
}

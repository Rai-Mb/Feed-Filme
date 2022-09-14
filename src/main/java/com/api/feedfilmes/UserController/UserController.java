package com.api.feedfilmes.UserController;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(path = "/api/user/{codigo}")
    public ResponseEntity consultar (@PathVariable("codigo") String codigo){
        return null;

    }
}

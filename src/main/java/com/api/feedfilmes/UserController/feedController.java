package com.api.feedfilmes.UserController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class feedController {

    @GetMapping(path = "/api/feed")
    public String status() {
        return "Feed Filmes";
    }
}

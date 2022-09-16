package com.api.feedfilmes.UserController;


import com.api.feedfilmes.model.FeedModel;
import com.api.feedfilmes.repository.FeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/userFeed")
public class UserController {

    @Autowired
    private FeedRepository repository;

    @GetMapping("/api/userFeed/codigo")
    public ResponseEntity consultar (@PathVariable("codigo") UUID codigo){
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());

    }
    @PostMapping
    public FeedModel salvar(@RequestBody FeedModel usuario){
        return repository.save(usuario);
    }
}

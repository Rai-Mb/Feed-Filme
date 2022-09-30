package com.api.feedfilmes.controller;


import com.api.feedfilmes.dto.FeedDto;
import com.api.feedfilmes.model.FeedModel;
import com.api.feedfilmes.service.FeedService;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/feedFilmes")
public class FeedController {

    final FeedService feedService;

    public FeedController(FeedService feedService) {
        this.feedService = feedService;
    }

    @PostMapping
    public ResponseEntity<Object> saveFeedFilmes(@RequestBody FeedDto feedDto){
        var feedModel = new FeedModel();
        BeanUtils.copyProperties(feedDto, feedModel);
        feedModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(feedService.save(feedModel));
    }

    @GetMapping
    public ResponseEntity<Page<FeedModel>> getAllFeedFilmes(@PageableDefault(page = 0, size = 10,
            sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        return  ResponseEntity.status(HttpStatus.OK).body(feedService.findAll(pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneFeedFilmes(@PathVariable(value = "id")UUID id){
        Optional<FeedModel> feedModelOptional = feedService.findByid(id);
        if (!feedModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Filme não encontrado");
        }
            return ResponseEntity.status(HttpStatus.OK).body(feedModelOptional.get());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteFeedFilmes(@PathVariable(value = "id") UUID id){
        Optional<FeedModel> feedModelOptional = feedService.findByid(id);
        if (!feedModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body("Filme deletado com sucesso.");
        }
        feedService.delete(feedModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Filme deletado com sucesso.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updadteFeedFilmes(@PathVariable(value = "id") UUID id,
                                                    @RequestBody @Valid FeedDto feedDto){
        Optional<FeedModel> feedModelOptional = feedService.findByid(id);
        if(!feedModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Filme não encontrado.");
        }
        var feedModel = feedModelOptional.get();
        feedModel.setNomeDoFilme(feedDto.getNomeDoFilme());
        feedModel.setGenero(feedDto.getGenero());
        feedModel.setClasseDeIdade(feedDto.getClasseDeIdade());
        feedModel.setLancamento(feedDto.getLancamento());
        feedModel.setFeedBack(feedModel.getFeedBack());
        return ResponseEntity.status(HttpStatus.OK).body(feedService.save(feedModel));
    }
}

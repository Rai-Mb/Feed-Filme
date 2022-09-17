package com.api.feedfilmes.UserController;


import com.api.feedfilmes.Dto.FeedDto;
import com.api.feedfilmes.model.FeedModel;
import com.api.feedfilmes.service.FeedService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/feed/filme")
public class FeedController {

    final FeedService feedService;

    public FeedController(FeedService feedService) {
        this.feedService = feedService;
    }

    @PostMapping
    public ResponseEntity<Object> saveFeedFilmes(@RequestBody @Valid FeedDto feedDto){
        var feedModel = new FeedModel();
        BeanUtils.copyProperties(feedDto, feedModel);
        feedModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(feedService.save(feedModel));
    }

}

package com.api.feedfilmes.service;

import com.api.feedfilmes.model.FeedModel;
import com.api.feedfilmes.repository.FeedRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class FeedService {

    final FeedRepository feedRepository;

    public FeedService(FeedRepository feedRepository){
        this.feedRepository = feedRepository;
    }

    @Transactional
    public FeedModel save(FeedModel feedModel) {
        return feedRepository.save(feedModel);
    }
}

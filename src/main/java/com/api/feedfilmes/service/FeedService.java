package com.api.feedfilmes.service;

import com.api.feedfilmes.model.FeedModel;
import com.api.feedfilmes.repository.FeedRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

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
    public Page<FeedModel> findAll(Pageable pageable){
        return feedRepository.findAll(pageable);
    }
    public Optional<FeedModel> findByid(UUID id) {
        return feedRepository.findById(id);
    }
    @Transactional
    public void delete(FeedModel feedModel) {
        feedRepository.delete(feedModel);
    }
}
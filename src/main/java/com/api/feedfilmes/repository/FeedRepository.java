package com.api.feedfilmes.repository;


import com.api.feedfilmes.model.FeedModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface FeedRepository extends JpaRepository <FeedModel, UUID>{

}

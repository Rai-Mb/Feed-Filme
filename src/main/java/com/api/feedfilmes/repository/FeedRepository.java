package com.api.feedfilmes.repository;


import com.api.feedfilmes.model.FeedModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FeedRepository extends JpaRepository <FeedModel, Long>{

}

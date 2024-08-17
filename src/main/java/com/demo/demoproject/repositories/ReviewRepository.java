package com.demo.demoproject.repositories;

import com.demo.demoproject.models.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ReviewRepository extends MongoRepository<Review, String> {
    List<Review> findByLecturerId(Long lecturerId);
}
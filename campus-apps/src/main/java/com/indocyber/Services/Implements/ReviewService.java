package com.indocyber.Services.Implements;

import com.indocyber.Entities.Review;
import com.indocyber.Repositories.ReviewRepository;
import com.indocyber.Services.Interfaces.ReviewServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ReviewService implements ReviewServe {
    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public void save(Review review) {
        this.reviewRepository.save(review);
    }

    @Override
    public Review findById(int i) {
        Optional<Review> byId = this.reviewRepository.findById(i);
        Review review = byId.get();

        return review;
    }

    @Override
    public List<Review> findAllCourse() {
        return this.reviewRepository.findAll();
    }

    @Override
    public void delete(Review review) {
        this.reviewRepository.delete(review);
    }
}

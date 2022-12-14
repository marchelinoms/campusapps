package com.indocyber.Services.Interfaces;



import com.indocyber.Entities.Review;

import java.util.List;

public interface ReviewServe {

    void  save(Review review);

    Review findById(int i);

    List<Review> findAllCourse();

    void delete(Review review);
}

package com.cg.service;

import java.util.List;

import com.cg.dto.request.ReviewDto;
import com.cg.entities.Product;
import com.cg.entities.Review;

public interface ReviewService {
	Review addReviewService(ReviewDto reviewDto);
	List<Review> allReviewsService(int pid);
	 Review updateReviewService(ReviewDto reviewDto, int rid);
	 List<Product> findProductsRatingsMorethanService(float ratings);
	 void removeReviewService(int rid);
	 Review readReviewService(int rid);
	 List<Review> searchByUsers(String uname);
}

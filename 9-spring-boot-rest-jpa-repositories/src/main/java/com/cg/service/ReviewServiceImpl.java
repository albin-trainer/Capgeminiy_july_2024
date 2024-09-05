package com.cg.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dto.request.ReviewDto;
import com.cg.entities.Product;
import com.cg.entities.Review;
import com.cg.exception.ApplicationException;
import com.cg.repository.ProductRepository;
import com.cg.repository.ReviewRepository;
//@Component
@Service
@Transactional
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ProductRepository prodRep;
	@Autowired
	private ReviewRepository revRepo;
	@Override
	public Review addReviewService(ReviewDto reviewDto) {
	
		return null;
	}
	@Override
	public List<Review> allReviewsService(int pid) {
		// TODO Auto-generated method stub
		return revRepo.searchByProductId(pid);
	}
	@Override
	public Review updateReviewService(ReviewDto reviewDto, int rid) {
		
		return null;
	}
	@Override
	public List<Product> findProductsRatingsMorethanService(float ratings) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void removeReviewService(int rid) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Review readReviewService(int rid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Review> searchByUsers(String uname) {
		// TODO Auto-generated method stub
		return revRepo.findByUserName(uname);
	}

}

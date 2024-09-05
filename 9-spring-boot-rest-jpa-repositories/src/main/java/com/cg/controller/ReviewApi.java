package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.request.ReviewDto;
import com.cg.entities.Review;
import com.cg.service.ReviewService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/products/reviews")
public class ReviewApi {
	@Autowired
private ReviewService reviewService;
	@PostMapping
	public  ResponseEntity<Review> addReview(@RequestBody ReviewDto reviewDto) {
	
		return new ResponseEntity<Review>(reviewService.addReviewService(reviewDto),HttpStatusCode.valueOf(201));
	}
	
	@PutMapping("/{rid}")
	public  ResponseEntity<Review> updateReview(@RequestBody ReviewDto reviewDto, @PathVariable int rid) {
		return new ResponseEntity<Review>(reviewService.updateReviewService(reviewDto,rid),HttpStatusCode.valueOf(201));
	}
	@GetMapping("/search")
	public ResponseEntity<List<Review>> searchByUsers(@RequestParam("usr") String user){
		return new ResponseEntity<>(reviewService.searchByUsers(user),HttpStatusCode.valueOf(200));
	}
	@GetMapping("/prodId/{pid}")
	public ResponseEntity<List<Review>> searchByProductId(@PathVariable int pid){
		return new ResponseEntity<>(reviewService.allReviewsService(pid),HttpStatusCode.valueOf(200));
	}
}

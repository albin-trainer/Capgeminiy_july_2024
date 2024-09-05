package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.entities.Product;
import com.cg.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
	/*
	 * Review addReview(Review r);
	 *  List<Review> allReviews(int pid);
	 *   Review updateReview(Review r);
	 *    List<Product> findProductsRatingsMorethan(float	 * ratings); 
	 *    void removeReview(int rid);
          Review readReview(int rid);
	 */
	//@Query(value="select r ..........")
	//spring query method ==> method act as a query
	List<Review> findByUserName(String uname);
	
	@Query(value = "select * from Review where pid= :pid",
			nativeQuery = true)
	List<Review> searchByProductId(@Param("pid") int pid);
}

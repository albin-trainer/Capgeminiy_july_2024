package com.cg.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.entities.Product;
public interface ProductRepository 
extends JpaRepository<Product, Integer> {
	/*
Product addNewProduct(Product p);
Product searchById(int id);
List<Product> allProducts();
Product updateProduct(Product p, int pid);
*/
	@Query(value = "select p from Product p where p.productName like :pname%")
List<Product> searchByProductNameStartsWith( @Param("pname") String pname);

}

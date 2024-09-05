package com.cg.service;

import java.util.List;

import com.cg.entities.Product;
public interface ProductService {
	Product addNewProductService(Product p);
	Product searchByIdService(int id);
	List<Product> allProductsService();
	Product updateProductService(Product p, int pid);
	List<Product> searchByProductNameStartsWithService(String pname);

}

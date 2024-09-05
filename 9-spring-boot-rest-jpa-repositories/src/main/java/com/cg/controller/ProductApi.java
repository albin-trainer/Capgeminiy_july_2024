package com.cg.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Product;
import com.cg.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductApi {
	@Autowired
   private ProductService productService;
	//org.sl4j
	Logger log=LoggerFactory.getLogger(ProductApi.class);
	@PostMapping
	public ResponseEntity<Product> addNewProduct(@RequestBody @Valid  Product p) {
	 
		return new ResponseEntity<Product>(productService.addNewProductService(p),HttpStatusCode.valueOf(201));
	}
	@GetMapping("/search")
	public List<Product> searchByProductNameStartsWithService(@RequestParam("name")  String pname) {
		log.info("searching the product name "+pname);
		return productService.searchByProductNameStartsWithService(pname);
	}
}

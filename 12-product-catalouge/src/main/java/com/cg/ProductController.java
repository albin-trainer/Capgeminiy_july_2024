package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Product;
import com.cg.service.ProductServiceImpl;

@RestController
public class ProductController {
	@Autowired
	private Environment env;
	@Autowired
	private ProductServiceImpl service;
	@GetMapping("/hello")
public String hello() {
String port=env.getProperty("local.server.port");
return "I m coming from ProductCataluge and port no is "+port;
}
	@GetMapping("/products/{pid}")
	public ResponseEntity<Product> orderProducts(@PathVariable int pid) {
		//call product stream
		//filter the list by streams
		//set the port no in the product
		//return the Product
		Product product=service.allProducts().stream().filter(p->p.getProductId()==pid).findFirst().get();
		product.setPortNo(env.getProperty("local.server.port"));
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
}

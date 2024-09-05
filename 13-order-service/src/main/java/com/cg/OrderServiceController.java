package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.model.Order;
@RestController
public class OrderServiceController {
   @GetMapping("/test")
	public String test() {
	   String url="http://localhost:8000/hello";
	   //ResponseEntity ==> means the resp from the rest API it has headers and body
	   //RestTemplate ==> used for REST Client
	   ResponseEntity<String> resp=
	    new RestTemplate().getForEntity(url, String.class);
	   String msg=resp.getBody();
		return msg;
	}
   @GetMapping("/order/{pid}/{q}")
   public ResponseEntity<Order> orderProducts(@PathVariable int pid,
		   @PathVariable("q") int quantity) {
	   String url="http://localhost:8000/products/"+pid;
	   ResponseEntity<Order> resp=
	   new RestTemplate().getForEntity(url, Order.class);
	   Order order=resp.getBody();
	   order.setQuantity(quantity);
	   order.setPrice(order.getPrice()*quantity);
	   
	   return new ResponseEntity<Order>(order,HttpStatus.OK);
   }
   @Autowired
   private RestTemplate restTemplate;
   @GetMapping("/orderLoadBal/{pid}/{q}")
   public ResponseEntity<Order> orderProductsLoadBal(@PathVariable int pid,
		   @PathVariable("q") int quantity) {
	   String url="http://product-catalouge/products/"+pid;
	   ResponseEntity<Order> resp=
			   restTemplate.getForEntity(url, Order.class);
	   Order order=resp.getBody();
	   order.setQuantity(quantity);
	   order.setPrice(order.getPrice()*quantity);
	   
	   return new ResponseEntity<Order>(order,HttpStatus.OK);
   }
}

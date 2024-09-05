package com.cg.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.cg.entities.Product;
import com.cg.exception.ApplicationException;
import com.cg.repository.ProductRepository;
@Component
@Transactional
public class ProductServiceImpl implements ProductService{
@Autowired
	private ProductRepository productRep;
	@Override
	public Product addNewProductService(Product p) {
		return productRep.save(p);
	}
	public Product searchByIdService(int id) {
		return productRep.findById(id).
				orElseThrow(()->new ApplicationException("Prod not found"));
	}
	public List<Product> allProductsService() {
		return productRep.findAll();
	}
	@Override
	public Product updateProductService(Product p, int pid) {
		productRep.findById(pid).
		orElseThrow(()->new ApplicationException("Prod not found"));
		return productRep.save(p);//update or insert same method
	}
	@Override
	public List<Product> searchByProductNameStartsWithService(String pname) {
		return productRep.searchByProductNameStartsWith(pname);
	}

}

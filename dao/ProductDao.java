package com.oasys.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.product.Product;
import com.oasys.product.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository proRepo;

	public String addproduct(Product p) {
		proRepo.save(p);
		return "Saved Successfully";
		
	}
	
	public String addproductlist(List<Product> p) {
		proRepo.saveAll(p);
		return "Saved Successfully";
	}
	
	public List<Product> getlist(){
		return proRepo.findAll();
	}
	
	public List<Product> getProductByPrice(int price1,int price2){
		return proRepo.getProductsByPrice(price1, price2);
	}
	
	/*public int getPercentageByHsncode(int hs) {
		return proRepo.getPercentageByHsncode(hs);
	}*/
}

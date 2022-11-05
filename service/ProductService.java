package com.oasys.product.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.product.Product;
import com.oasys.product.dao.ProductDao;

@Service
public class ProductService {
@Autowired
ProductDao proDao;

	public String addproduct(Product p) {
		return proDao.addproduct(p);
	}
	
	public String addproductlist(List<Product> p) {
		return proDao.addproductlist(p);
	}
	
	public List<Product> getlist(){
		return proDao.getlist();
	}
	
	
	public List<Product> getProductByPrice(int price1,int price2){
		return proDao.getProductByPrice(price1,price2);
	}
	
	
	/*public int getPercentageByHsncode(int hs) {
		return proDao.getPercentageByHsncode( hs);
	}*/
	
}

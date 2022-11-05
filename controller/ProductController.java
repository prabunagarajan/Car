package com.oasys.product.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.product.Product;
import com.oasys.product.service.ProductService;

@RestController
public class ProductController {
@Autowired
ProductService proscr;

@PostMapping(value="/addproduct")
public String addproduct(@RequestBody Product p) {
	return proscr.addproduct(p);
}

@PostMapping(value="/addproductlist")
public String addproductlist(@RequestBody List<Product> p) {
	return proscr.addproductlist(p);
}

@GetMapping(value="/getlist")
public List<Product> getlist(){
	return proscr.getlist();
}


@GetMapping(value="/getproductbyprice/{price1}/{price2}")
public List<Product> getProductByPrice(@PathVariable int price1, @PathVariable int price2){
	return proscr.getProductByPrice(price1,price2);
}


/*@GetMapping(value="/getpercentagebyhsn/{hs}")
public int getPercentageByHsncode(@PathVariable int hs) {
	return proscr.getPercentageByHsncode(hs);
}*/
}

package com.oasys.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oasys.product.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	@Query(value="select * from product where price >=:pri1 AND price<=:pri2",nativeQuery = true)
	public List<Product> getProductsByPrice(@Param ("pri1") int p1,@Param ("pri2") int p2);
	
	/*@Query(value="select percentage from gst where hsncode=:hc1",nativeQuery = true)
	public int getPercentageByHsncode(@Param ("hc1") int hc1);*/
	
	/*@Query(value="select product.name,product.price,product.hsncode,gst.percentage from training.product inner join training.gst on product.hsncode=gst.hsncode;")
	public List<Product> getPerByHsncode();*/
}

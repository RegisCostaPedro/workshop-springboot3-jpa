package com.regiscostapedro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regiscostapedro.course.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

	
	
}

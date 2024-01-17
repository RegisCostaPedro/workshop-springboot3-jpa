package com.regiscostapedro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regiscostapedro.course.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

	
	
}

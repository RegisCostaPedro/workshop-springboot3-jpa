package com.regiscostapedro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regiscostapedro.course.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

	
	
}

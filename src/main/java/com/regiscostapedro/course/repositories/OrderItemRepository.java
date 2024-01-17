package com.regiscostapedro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regiscostapedro.course.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{

	
	
}

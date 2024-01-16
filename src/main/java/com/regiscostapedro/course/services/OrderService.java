package com.regiscostapedro.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regiscostapedro.course.entities.Order;
import com.regiscostapedro.course.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}

	public Order findById(Long id) {
	Optional<Order> obj  =repository.findById(id);
	return obj.get();
	}
}

package com.regiscostapedro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regiscostapedro.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

	
	
}

package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Bookings;
import com.example.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


	User findByEmailAndPassword(String email,String password);

	Bookings save(Bookings bookings);

	
	
}

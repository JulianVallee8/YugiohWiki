package com.yugiohwiki.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yugiohwiki.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByUsername(String userName);
}

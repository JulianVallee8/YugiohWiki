package com.yugiohwiki.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yugiohwiki.Monster;

public interface MonsterRepository extends JpaRepository<Monster, Integer> {
}

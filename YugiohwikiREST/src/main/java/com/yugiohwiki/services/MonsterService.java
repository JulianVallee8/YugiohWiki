package com.yugiohwiki.services;

import java.util.List;

import com.yugiohwiki.Monster;

public interface MonsterService {
	
	public List<Monster> showAll();
	public Monster showMonsterById(int id);
	public Monster createMonster(String userName, Monster monster);
	public Monster updateMonster(int id, Monster monster);
	public boolean destroy(int id, String userName);

}

package com.yugiohwiki.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yugiohwiki.Monster;
import com.yugiohwiki.User;
import com.yugiohwiki.repositories.MonsterRepository;
import com.yugiohwiki.repositories.UserRepository;

@Service
public class MonsterServiceImpl implements MonsterService {
	
	@Autowired
	private MonsterRepository monsterRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	
	@Override
	public List<Monster> showAll() {
		return monsterRepo.findAll();
	}
	
	@Override
	public Monster showMonsterById(int id) {
		return monsterRepo.findById(id).get();
	}

	@Override
	public Monster createMonster(String userName, Monster monster) {
		//TODO maybe remove userName and have a parameter set up in monster to take the userName
		int userId = userRepo.findByUsername(userName).getId();
		monster.setCreatedMonster(userId);
		monsterRepo.saveAndFlush(monster);
		return monster;
	}

	@Override
	public Monster updateMonster(int id, Monster monster) {
		Monster updateMonster = monsterRepo.findById(id).get();
		if(monster.getAttackpoints() != 0) {
			updateMonster.setAttackpoints(monster.getAttackpoints());
		}
		if(monster.getAttribute() != null) {
			updateMonster.setAttribute(monster.getAttribute());
		}
		if(monster.getDefensepoints() != 0) {
			updateMonster.setDefensepoints(monster.getDefensepoints());
		}
		if(monster.getDescription() != null) {
			updateMonster.setDescription(monster.getDescription());
		}
		if(monster.getMonsterImageUrl() != null) {
			updateMonster.setMonsterImageUrl(monster.getMonsterImageUrl());
		}
		if(monster.getName() != null) {
			updateMonster.setName(monster.getName());
		}
		if(monster.getType() != null) {
			updateMonster.setType(monster.getType());
		}
		
			
		return monsterRepo.saveAndFlush(updateMonster);
	}

	@Override
	public boolean destroy(int id, String userName) {
		// TODO Auto-generated method stub
		return false;
	}


}

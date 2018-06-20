package com.yugiohwiki;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Monster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="attackpoints")
	private int attackpoints;
	
	@Column(name="defensepoints")
	private int defensepoints;
	
	@Column(name="attribute")
	private String attribute;
	
	@Column(name="type")
	private String type;
	
	@Column(name="description")
	private String description;
	
	@Column(name="monsterimage_url")
	private String monsterImageUrl;
	
	
	@Column(name="editTimestamp")
	private int editTime;
	
	@Column(name="lastEdit")
	private int lastEdit;
	
	@Column(name="createdMonster")
	private int createdMonster;
	
	// END FIELDS
	
	public Monster() {}


	@Override
	public String toString() {
		return "Monster [id=" + id + ", name=" + name + ", attackpoints=" + attackpoints + ", defensepoints="
				+ defensepoints + ", attribute=" + attribute + ", type=" + type + ", description=" + description
				+ ", monsterImageUrl=" + monsterImageUrl + ", editTime=" + editTime + ", lastEdit=" + lastEdit
				+ ", createdMonster=" + createdMonster + "]";
	}





	// START GETs & SETs
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttackpoints() {
		return attackpoints;
	}

	public void setAttackpoints(int attackpoints) {
		this.attackpoints = attackpoints;
	}

	public int getDefensepoints() {
		return defensepoints;
	}

	public void setDefensepoints(int defensepoints) {
		this.defensepoints = defensepoints;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMonsterImageUrl() {
		return monsterImageUrl;
	}

	public void setMonsterImageUrl(String monsterImageUrl) {
		this.monsterImageUrl = monsterImageUrl;
	}
	
	public int getEditTime() {
		return editTime;
	}


	public void setEditTime(int editTime) {
		this.editTime = editTime;
		
		
	}


	public int getLastEdit() {
		return lastEdit;
	}


	public void setLastEdit(int lastEdit) {
		this.lastEdit = lastEdit;
	}


	public int getCreatedMonster() {
		return createdMonster;
	}


	public void setCreatedMonster(int createdMonster) {
		this.createdMonster = createdMonster;
	}
	// END GETs & SETs


	// START CONSTRUCTORS
	public Monster(int id, String name, int attackpoints, int defensepoints, String attribute, String type,
			String description, String monsterImageUrl, int editTime, int lastEdit, int createdMonster) {
		super();
		this.id = id;
		this.name = name;
		this.attackpoints = attackpoints;
		this.defensepoints = defensepoints;
		this.attribute = attribute;
		this.type = type;
		this.description = description;
		this.monsterImageUrl = monsterImageUrl;
		this.editTime = editTime;
		this.lastEdit = lastEdit;
		this.createdMonster = createdMonster;
	}


	



}

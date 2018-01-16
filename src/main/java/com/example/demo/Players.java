package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Players {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String position;
	
	
	public Players(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	public Players() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	


}

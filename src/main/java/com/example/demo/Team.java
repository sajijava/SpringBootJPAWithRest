package com.example.demo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Team {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String location;
	private String mascot;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="teamId")
	private Set<Players> players;
	

	
	public Team() {
		super();
	}
	
	public Team(String name, String location,  Set<Players> players) {
		super();
		this.name = name;
		this.location = location;
		this.mascot = mascot;
		this.players = players;
	}
	public Set<Players> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Players> players) {
		this.players = players;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascot() {
		return mascot;
	}
	public void setMascot(String mascot) {
		this.mascot = mascot;
	}
	
	
	

}

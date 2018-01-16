package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaWithRestApplication {

	@Autowired
	private TeamDAO teamDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaWithRestApplication.class, args);
	}
	@PostConstruct
	public void init()
	{
		Set<Players> players = new HashSet();
		players.add(new Players("Snoopy","Pitcher"));
		players.add(new Players("Charle Brown","Shortstop"));
		
		Team team = new Team("Peanuts","California", players);
		teamDao.save(team);
		
	}
}

package com.javainuse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.model.Team;
import com.javainuse.repository.TeamRepository;




@Service
public class Myservice {


	@Autowired
	TeamRepository dao;
	
	
	public Team addteam(Team team) {
		return dao.save(team);
	}
	public Team updateteam(Team team) {
		return dao.save(team);
	}
	public void deleteteam(int id) {
		dao.deleteById((long) id);
	
	}

}
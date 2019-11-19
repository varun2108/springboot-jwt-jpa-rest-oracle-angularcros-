package com.javainuse.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Team;
import com.javainuse.repository.TeamRepository;
import com.javainuse.service.Myservice;

@RestController
@CrossOrigin()
public class HelloWorldController {
	@Autowired
	TeamRepository te;
	@RequestMapping({ "/hello" })
	public Iterable<Team> teams(){
		Iterable<Team> t=new ArrayList<Team>();
		System.out.println(te.findAll());
		return te.findAll();
	}
	@Autowired
	public Myservice service;
	@RequestMapping(value= "/showteams", method= RequestMethod.GET)
	public Iterable<Team> teams1(){
		Iterable<Team> t=new ArrayList<Team>();
		System.out.println(te.findAll());
		return te.findAll();
	}
	@RequestMapping(value= "/addteam", method= RequestMethod.POST)
	public Team createteam(@RequestBody Team newteam) {
		System.out.println(this.getClass().getSimpleName() + " - Create new employee method is invoked.");
		return service.addteam(newteam);
	}
	@RequestMapping(value= "/updateteam", method= RequestMethod.PUT)
	public Team updateteam(@RequestBody Team updteam) throws Exception {
		System.out.println(this.getClass().getSimpleName() + " - Update employee details by id is invoked.");

		
		return service.updateteam(updteam);
	}
	@RequestMapping(value= "/deleteteam/{id}", method= RequestMethod.DELETE)
	public void deleteteam(@PathVariable int id) throws Exception {
		System.out.println(this.getClass().getSimpleName() + " - Update employee details by id is invoked.");

		
		 service.deleteteam(id);
		 
	}
}

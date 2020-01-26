package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Alien;
import com.example.demo.dao.AlienDao;


@RestController
public class AlienController {

	@Autowired
	AlienDao dao;
	
	@RequestMapping("/")
	public String home(Alien alien)
	{
		return "home.jsp";
	}
	
	
	@GetMapping(path="/aliens")
	@ResponseBody
	public List<Alien> getAliens()
	{
		
		return dao.findAll();
	}
	
	@PostMapping(path="/alien", consumes= {"application/json"})
	@ResponseBody
	public Alien addAlien(@RequestBody Alien alien)
	{
		
		 dao.save(alien);
		 return alien;
	}
	
	@GetMapping(path="/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") int aid)
	{
		return dao.findById(aid);
	}
	
	@DeleteMapping(path="/alien/{aid}")
	@ResponseBody
	public String addAlien(@PathVariable("aid") int aid)
	{
		String name = dao.getOne(aid).getAname();
		 dao.deleteById(aid);
		 return "Deleted " + name;
		 
	}
	

	@PutMapping(path="/alien")
	@ResponseBody
	public Alien updateAlien(@RequestBody Alien alien)
	{
		 dao.save(alien);
		 
		 return alien;
	}
}

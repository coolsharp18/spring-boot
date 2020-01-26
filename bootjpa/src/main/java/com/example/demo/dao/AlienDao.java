package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Alien;

public interface AlienDao extends JpaRepository<Alien, Integer> 
{

	
}

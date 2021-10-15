package com.cursospring.app.proyecto1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursospring.app.proyecto1.model.User;
import com.cursospring.app.proyecto1.service.SportsService;

@RestController
public class SportsController {
	
	@Qualifier("sports")
	SportsService sportsService;
	
	@Autowired
	public SportsController(SportsService sportsService) {
		this.sportsService = sportsService;
	}



	@PostMapping("/user/sports")
	public List<String> postUserSports ( @RequestBody User user) {
		return sportsService.getData(user.getSalary(),user.getAge());
	}

}

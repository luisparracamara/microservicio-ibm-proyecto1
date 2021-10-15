package com.cursospring.app.proyecto1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursospring.app.proyecto1.model.User;
import com.cursospring.app.proyecto1.service.TravelsService;

@RestController
public class TravelsController {
	
	@Qualifier("travels")
	TravelsService travelsService;
	
	@Autowired
	public TravelsController(TravelsService travelsService) {
		this.travelsService = travelsService;
	}

	@PostMapping("/user/travels")
	public List<String> postUserTravels ( @RequestBody User user) {
		return travelsService.getData(user.getSalary(),user.getAge());
	}
	

}

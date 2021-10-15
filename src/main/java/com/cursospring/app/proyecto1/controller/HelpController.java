package com.cursospring.app.proyecto1.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursospring.app.proyecto1.model.User;
import com.cursospring.app.proyecto1.service.HelpService;

@RestController
public class HelpController {
	@Qualifier("help")
	HelpService helpService;

	@Autowired
	public HelpController(HelpService helpService) {
		this.helpService = helpService;
	}
	
	@PostMapping("/user/help")
	public List<String> postUserHelp ( @RequestBody User user) {
		return helpService.getData(user.getSalary(),user.getAge());
	}
}

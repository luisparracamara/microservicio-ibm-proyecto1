package com.cursospring.app.proyecto1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursospring.app.proyecto1.model.User;
import com.cursospring.app.proyecto1.service.MyStyleService;

@RestController
public class MyStyleController {
	@Qualifier("mystyle")
	MyStyleService myStyleService;

	@Autowired
	public MyStyleController(MyStyleService myStyleService) {
		this.myStyleService = myStyleService;
	}
	
	@PostMapping("/user/mystyle")
	public List<String> postUserMyStyle ( @RequestBody User user) {
		return myStyleService.getData(user.getSalary(),user.getAge());
	}
	
	
}

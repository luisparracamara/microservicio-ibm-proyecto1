package com.cursospring.app.proyecto1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursospring.app.proyecto1.model.User;
import com.cursospring.app.proyecto1.service.MyBusinessService;

@RestController
public class MyBusinessController {
	
	@Qualifier("mybusiness")
	MyBusinessService myBusinessService;

	@Autowired
	public MyBusinessController(MyBusinessService myBusinessService) {
		this.myBusinessService = myBusinessService;
	}
	
	@PostMapping("/user/mybusiness")
	public List<String> postUserMyBusiness ( @RequestBody User user) {
		return myBusinessService.getData(user.getSalary(),user.getAge());
	}
	

}

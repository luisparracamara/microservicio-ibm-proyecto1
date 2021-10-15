package com.cursospring.app.proyecto1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursospring.app.proyecto1.model.User;
import com.cursospring.app.proyecto1.service.ShoppingService;
import com.cursospring.app.proyecto1.service.TravelsService;

@RestController
public class ShoppingController {
	
	@Qualifier("shopping")
	ShoppingService shoppingService;


	@Autowired
	public ShoppingController(ShoppingService shoppingService, TravelsService travelsService) {
		this.shoppingService = shoppingService;
	}
	
	@PostMapping("/shopping")
	public List<String> postUserShopping ( @RequestBody User user) {
		return shoppingService.getData(user.getSalary(),user.getAge());
	}
	

	

}

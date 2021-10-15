package com.cursospring.app.proyecto1.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("mybusiness")
public class MyBusinessService implements IUserService{
	
	final String officeDepot = "Office depot";
	final String costco = "Costco";
	final String bestBuy = "Best Buy Banamex";
	final String homeDepot = "The Home Depot";

	@Override
	public List<String> getData(Integer salary, Integer age) {
		if(salary >= 12000 && age >= 18 && age <= 75) {
			return Arrays.asList(officeDepot,costco,bestBuy,homeDepot);	
		}
		
		
		return Arrays.asList("No se encontró tarejeta ideal para usted");
	}

}

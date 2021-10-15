package com.cursospring.app.proyecto1.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("mystyle")
public class MyStyleService implements IUserService {

	final String bsmart = "B-smart";
	final String afinity = "Afinity Card";
	final String oro = "Oro";
	final String platinum = "Platinum";
	
	@Override
	public List<String> getData(Integer salary, Integer age) {
		
		if(salary >= 7000 && salary<= 14999 && age >= 18 && age <= 32) {
			return Arrays.asList(bsmart,afinity);	
		}
		
		if(salary >= 7000 && salary<= 14999 && age >= 33 && age <= 75) {
			return Arrays.asList(bsmart);	
		}
		
		if(salary >= 15000 && salary<= 29999 && age >= 18 && age <= 23) {
			return Arrays.asList(bsmart,afinity);
		}
		
		if(salary >= 15000 && salary<= 29999 && age >= 24 && age <= 32) {
			return Arrays.asList(bsmart,oro,afinity);
		}
		
		if(salary >= 15000 && salary<= 29999 && age >= 33 && age <= 75) {
			return Arrays.asList(oro);
		}
		
		if(salary >= 30000 && salary<= 34999 && age >= 18 && age <= 23) {
			return Arrays.asList(bsmart,afinity);	
		}
		
		if(salary >= 30000 && salary<= 34999 && age >= 24 && age <= 32) {
			return Arrays.asList(bsmart,platinum, afinity);	
		}
		
		if(salary >= 30000 && salary<= 34999 && age >= 33 && age <= 75) {
			return Arrays.asList(platinum);	
		}
		
		if(salary >= 35000 && age >= 18 && age <= 23) {
			return Arrays.asList(bsmart);	
		}
		
		if(salary >= 35000 && age >= 24 && age <= 75) {
			return Arrays.asList(bsmart, platinum);	
		}
		
		
		return Arrays.asList("No se encontró tarejeta ideal para usted");

	}

}

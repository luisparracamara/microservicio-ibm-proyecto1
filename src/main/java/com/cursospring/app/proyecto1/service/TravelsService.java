package com.cursospring.app.proyecto1.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("travels")
public class TravelsService implements IUserService {
	
	final String  citi = "Citi / AAdvantage";
	final String platinum = "Platinum";

	@Override
	public List<String> getData(Integer salary, Integer age) {
		
		if(salary >= 12000 &&  salary <= 29999 && age >= 18 && age <= 75) {
			return Arrays.asList(citi);	
		}
		
		if(salary >= 30000 &&  salary <= 34999 && age >= 18 && age <= 23) {
			return Arrays.asList(citi);	
		}
		
		if(salary >= 30000 &&  salary <= 34999 && age >= 24 && age <= 75) {
			return Arrays.asList(citi,platinum);	
		}
		
		if(salary >= 35000 &&  salary <= 49999 && age >= 18 && age <= 23) {
			return Arrays.asList(citi);	
		}
		
		if(salary >= 35000 &&  salary <= 49999 && age >= 24 && age <= 75) {
			return Arrays.asList(citi,platinum);	
		}
		
		if(salary >= 50000 && age >= 18 && age <= 22) {
			return Arrays.asList(citi);	
		}
		
		if(salary >= 50000 && age >= 23 && age <= 75) {
			return Arrays.asList(platinum);	
		}

		return Arrays.asList("No se encontró tarejeta ideal para usted");
	}

}

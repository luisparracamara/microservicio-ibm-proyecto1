package com.cursospring.app.proyecto1.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("sports")
public class SportsService implements IUserService {
	
	final String martiClasica = "Martí Clásica Citibanamex";
	final String america = "América Deporteísmo"; 
	final String pumas = "Pumas Deporteísmo"; 
	final String toluca = "Toluca Deporteísmo"; 
	final String verde = "La verde"; 
	final String martiPremium = "Martí Premium Citibanamex"; 

	@Override
	public List<String> getData(Integer salary, Integer age) {
		
		if(salary >= 7000 && salary<= 34999 && age >= 18 && age <= 75) {
			return Arrays.asList(martiClasica,america,pumas,toluca,verde);	
		}
		
		if(salary >= 35000  && age >= 18 && age <= 75) {
			return Arrays.asList(martiPremium);	
		}
		
		
		return Arrays.asList("No se encontró tarejeta ideal para usted");
	}

}

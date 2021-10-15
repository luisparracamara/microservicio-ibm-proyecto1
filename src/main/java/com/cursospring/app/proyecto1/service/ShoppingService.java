package com.cursospring.app.proyecto1.service;

import java.util.Arrays;

import java.util.List;

import org.springframework.stereotype.Service;


@Service("shopping")
public class ShoppingService implements IUserService{
	
	final String bsmart = "B-smart";
	final String afinity = "Afinity Card";
	final String oro = "Oro";
	final String platinum = "Platinum";
	final String clasica = "Clasica";
	final String officeDepot = "Office depot";
	final String costco = "Costco";
	final String bestBuy = "Best Buy Banamex";
	final String homeDepot = "The Home Depot";

	@Override
	public List<String> getData(Integer salary, Integer age) {

		if(salary >= 7000 && salary<= 14999 && age >= 18 && age <= 23) {
			return Arrays.asList(bsmart,afinity);	
		}
		
		if(salary >= 7000 && salary<= 14999 && age >= 24 && age <= 32) {
			return Arrays.asList(bsmart,clasica,officeDepot);	
		}
		
		if(salary >= 7000 && salary<= 14999 && age >= 33 && age <= 75) {
			return Arrays.asList(clasica, officeDepot, costco, 
					bestBuy, homeDepot);	
		}
		
		
		if(salary >= 15000 && salary<= 34999 && age >= 18 && age <= 23) {
			return Arrays.asList(bsmart,afinity);	
		}
		if(salary >= 15000 && salary<= 34999 && age >= 24 && age <= 32) {
			return Arrays.asList(oro,afinity, officeDepot, costco,
					bestBuy, homeDepot);	
		}
		if(salary >= 15000 && salary<= 34999 && age >= 33 && age <= 75) {
			return Arrays.asList(oro,officeDepot, costco,
					bestBuy, homeDepot);	
		}
		
		
		if(salary >= 35000 && salary<= 49999 && age >= 18 && age <= 23) {
			return Arrays.asList(bsmart,afinity);	
		}
		
		if(salary >= 35000 && salary<= 49999 && age >= 24 && age <= 75) {
			return Arrays.asList(platinum, officeDepot, costco,
					bestBuy, homeDepot);	
		}

		
		if(salary >= 50000 && age >= 18 && age <= 23) {
			return Arrays.asList(bsmart,afinity);	
		}
		if(salary >= 50000 && age >= 24 && age <= 75) {
			return Arrays.asList(platinum);	
		}
		
		
		
		return Arrays.asList("No se encontró tarejeta ideal para usted");
	}

}

package com.cursospring.app.proyecto1.service;

import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Service;

/**
 * @author Luis Parra
 *
 */

@Service("help")
public class HelpService implements IUserService{

	final String banamex = "Banamex Teletón";
	final String apac = "Apac";

	@Override
	public List<String> getData(Integer salary, Integer age) {
		
		if(salary >= 12000 && age >= 18 && age <= 75) {
			return Arrays.asList(banamex,apac);	
		}
		
		
		
		return Arrays.asList("No se encontró tarejeta ideal para usted");
	}

	

}

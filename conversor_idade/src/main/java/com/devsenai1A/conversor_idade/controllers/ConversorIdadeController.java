package com.devsenai1A.conversor_idade.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorIdadeController {
	
	@PostMapping("/converter")
	@ResponseBody 
	public Map<String, Object> converterJson (
			@RequestParam int idade){
		
		int dias, meses;
		String faixae;
		double resultado1 = 0;
		double resultado2 = 0;
		String resultado3 = null;
		
		String erro = null;
		
		if (idade > 120) {
			erro = "Idade inválida!";
		} else if (idade < 0) {
			erro = "Idade inválida!";
		} else if (idade >= 0 && idade < 18) {
			meses = idade * 12;
			dias = idade * 365;
			faixae = "Esta pessoa é menor de idade";
			resultado1 = dias;
			resultado2 = meses;
			resultado3 = faixae;
			
		} else if (idade >= 18) {
			meses = idade * 12;
			dias = idade * 365;
			faixae = "Esta pessoa é maior de idade";
			resultado1 = dias;
			resultado2 = meses;
			resultado3 = faixae;
		} else {
			erro = "Erro :(";
		}
		
		Map<String, Object> resp = new HashMap <> ();
		resp.put("resultado1", resultado1);
		resp.put("resultado2", resultado2);
		resp.put("resultado3", resultado3);
		resp.put("erro", erro);
		return resp;

	}
}

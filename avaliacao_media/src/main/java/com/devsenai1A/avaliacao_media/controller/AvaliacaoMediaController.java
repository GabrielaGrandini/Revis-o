package com.devsenai1A.avaliacao_media.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvaliacaoMediaController {
	
	@PostMapping("/avaliar")
	@ResponseBody
	
	public Map <String, Object> avaliarJson (
			@RequestParam double n1,
			@RequestParam double n2, 
			@RequestParam double n3, 
			@RequestParam double n4,
			@RequestParam String nome) {
		
		double media = 0;
		String resultado1 = null;
		double resultado2 = 0;
		double resultado3 = 0;
		double resultado4 = 0;
		double resultado5 = 0;
		double resultado6 = 0;
		String resultado7 = null;
		String erro = null;
		
		if (n1 > 10 || n1 <0 || n2 > 10 || n2 <0 || n3 > 10 || n3 <0 || n3 > 10 || n3 <0) {
			erro = "Nota inválida";
		} else {
			media = (n1 + n2 + n3 + n4)/4;
		}
			 
		if (media < 5) {
			resultado1 = nome;
			resultado2 = n1;
			resultado3 = n2;
			resultado4 = n3;
			resultado5 = n4;
			resultado6 = media;
			resultado7 = "Reprovado";
		} else if (media >= 5 && media < 7) {
			resultado1 = nome;
			resultado2 = n1;
			resultado3 = n2;
			resultado4 = n3;
			resultado5 = n4;
			resultado6 = media;
			resultado7 = "Recuperação";
		} else if (media >= 7 && media <= 10) {
			resultado1 = nome;
			resultado2 = n1;
			resultado3 = n2;
			resultado4 = n3;
			resultado5 = n4;
			resultado6 = media;
			resultado7 = "Aprovado";
		} else {
			erro = "erro";
		}
			
		Map <String, Object> resp = new HashMap <> ();
		resp.put("resultado1", resultado1);
		resp.put("resultado2", resultado2);
		resp.put("resultado3", resultado3);
		resp.put("resultado4", resultado4);
		resp.put("resultado5", resultado5);
		resp.put("resultado6", resultado6);
		resp.put("resultado7", resultado7);
		resp.put("erro", erro);
		
		return resp;
		
	}

}

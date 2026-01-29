package com.devsenai1A.calculadora_desconto.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraDescontoController {
@PostMapping ("/calcular")
@ResponseBody

public Map<String, Object> calcularJson (
		@RequestParam double valorP,
		@RequestParam double valorD){

double valorF = 0;
double desconto = 0;
double resultado1 = 0;
double resultado2 = 0;
double resultado3 = 0;
String especial = null;
String erro = null;

if (valorP <= 0) {
	erro = "Produto inválido para desconto";
} else if (valorD > 0 && valorD <30 && valorP > 0) {
	desconto = valorD/100 * valorP;
	valorF = valorP - desconto;
	resultado1 = valorP;
	resultado2 = desconto;
	resultado3 = valorF;
} else if (valorD >= 30 && valorD <=50 && valorP >0) {
	desconto = valorD/100 * valorP;
	valorF = valorP - desconto;
	resultado1 = valorP;
	resultado2 = desconto;
	resultado3 = valorF;
	especial = "Desconto especial aplicado";
}
else {
	resultado1 = valorP;
	resultado2 = desconto;
	resultado3 = valorP;
}

Map <String, Object> resp = new HashMap <> ();
resp.put("resultado1", resultado1);
resp.put("resultado2", resultado2);
resp.put("resultado3", resultado3);
resp.put("especial", especial);
resp.put("erro", erro);

return resp;
}

}

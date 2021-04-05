package org.sambsoft.controllers;

import org.sambsoft.services.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	
	@Autowired
	private Calculator calculator;
	
	@GetMapping("/sum")
	public String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		
		return String.valueOf(calculator.sum(a, b));
	}

}

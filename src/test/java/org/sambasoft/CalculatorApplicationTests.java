package org.sambasoft;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.sambsoft.services.Calculator;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	private Calculator calculator = new Calculator();

	@Test
	void testSum() {
		assertEquals(calculator.sum(10, -10), 0); 
		
	}
}

package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class TemperatureConvertorTest {
	
	//create temperature object
	TemperatureConvertor temperature=new TemperatureConvertor();
	
	@Test
	void celsiusToFahrenheit() {
		assertEquals(86,temperature.celsiusToFahrenheit(30));
	}
	@Test
	void fahrenheitToCelsius() {
		assertEquals(30,temperature.fahrenheitToCelsius(86));
	}
	
}
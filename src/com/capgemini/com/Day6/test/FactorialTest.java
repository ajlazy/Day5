package com.capgemini.com.Day6.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import factorial.Factorial;
import factorial.FactorialException;
import factorial.InvalidInputException;

class FactorialTest {

	@Test
	void testGetFactorialWithValidInput() throws InvalidInputException, FactorialException {
		assertEquals(6, Factorial.getFactorial(3));
	}
	@Test
	void testGetFactorialWithinvalidInput() {
		assertThrows(FactorialException.class, ()->Factorial.getFactorial(Integer.MAX_VALUE));
	}

}







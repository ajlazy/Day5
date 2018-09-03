package com.capgemini.day5.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.com.day5.question1.MyCalculator;
import com.capgemini.com.day5.question1.NegativeException;
import com.capgemini.com.day5.question1.NotZeroException;

class MyCalculatorTest {

	@Test
	void testPowerWithvalidinputs() throws NotZeroException, NegativeException {
		assertEquals(243, MyCalculator.power(3,5));
		assertEquals(16, MyCalculator.power(2,4));
	}
		@Test
		void testPowerWithZeroInputs() {
		Exception e;
		 e=assertThrows(NotZeroException.class, () -> MyCalculator.power(0, 0));
		assertEquals("n and p should not be zero", e.getMessage());
		
	}
		@Test
		void testPowerWithNegativeInputs() {
			Exception e;
			 e=assertThrows(NegativeException.class, () -> MyCalculator.power(-1, 5));
			assertEquals("One of the values is negative", e.getMessage());
			 e=assertThrows(NegativeException.class, () -> MyCalculator.power(-1, -5));
				assertEquals("One of the values is negative", e.getMessage());
				 e=assertThrows(NegativeException.class, () -> MyCalculator.power(1, -5));
					assertEquals("One of the values is negative", e.getMessage());
			
		}


}

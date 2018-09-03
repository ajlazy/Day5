package com.capgemini.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.com.day5.question1.MyCalculator;
import com.capgemini.com.day5.question1.NotZeroException;
import com.capgemini.com.day5.question2.CountryNotValidException;
import com.capgemini.com.day5.question2.EmployeeNameInvalidException;
import com.capgemini.com.day5.question2.TaxCalculator;
import com.capgemini.com.day5.question2.TaxnotEligibleException;

class TaxCalculatorTest {

	@Test
	void validInputTest() throws CountryNotValidException, EmployeeNameInvalidException, TaxnotEligibleException {
		assertEquals(16000, TaxCalculator.calculateTax("john Doe", true, 200000));
		assertEquals(4500, TaxCalculator.calculateTax("john Doe", true, 75000));
		assertEquals(2000, TaxCalculator.calculateTax("john Doe", true, 40000));
		assertEquals(800, TaxCalculator.calculateTax("john Doe", true, 20000));
	}
	
	@Test
	void invalidCountryTest() 
	{
		Exception e;
		 e=assertThrows(CountryNotValidException.class, () -> TaxCalculator.calculateTax("john" ,false, 50000));
		assertEquals("The employee should be an Indian citizen for calculating tax", e.getMessage());
		
	}
	
	@Test
	void taxNotEligibleTest() 
	{
		Exception e;
		 e=assertThrows(TaxnotEligibleException.class, () -> TaxCalculator.calculateTax("john" ,true, 500));
		assertEquals("The employee does not need to pay tax", e.getMessage());
		
	}
	
	@Test
	void invalidNameTest() 
	{
		Exception e;
		 e=assertThrows(EmployeeNameInvalidException.class, () -> TaxCalculator.calculateTax("" ,true, 50000));
		assertEquals("The employee name cannot be empty", e.getMessage());
		
	}

		
		
		
	}



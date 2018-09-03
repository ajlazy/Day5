package com.capgemini.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.com.day5.question1.MyCalculator;
import com.capgemini.com.day5.question1.NegativeException;
import com.capgemini.com.day5.question1.NotZeroException;
import com.capgemini.com.day5.question5.InvalidDayException;
import com.capgemini.com.day5.question5.InvalidMonthException;
import com.capgemini.com.day5.question5.MyDate;

class MyDateTest {
	MyDate Date1=new MyDate(10,5,2000);

	@Test
	void testWithValidDate() throws InvalidDayException, InvalidMonthException {
		assertEquals("Valid Date", Date1.validDate());
		
	}
	MyDate Date2=new MyDate(30,13,2001);
	@Test
	void testWithInValidDay() throws InvalidDayException, InvalidMonthException {
		Exception e;
		 e=assertThrows(InvalidMonthException.class, () -> Date2.validDate());
		assertEquals("month is invalid", e.getMessage());
	}
	
	MyDate Date3=new MyDate(32,12,2001);
	@Test
	void testWithInValidDay1() throws InvalidDayException, InvalidMonthException {
		Exception e;
		 e=assertThrows(InvalidMonthException.class, () -> Date3.validDate());
		assertEquals("day is invalid", e.getMessage());
	}
//		@Test
//		void testPowerWithZeroInputs() {
//		Exception e;
//		 e=assertThrows(NotZeroException.class, () -> MyCalculator.power(0, 0));
//		assertEquals("n and p should not be zero", e.getMessage());
//		
//	}
//		@Test
//		void testPowerWithNegativeInputs() {
//			Exception e;
//			 e=assertThrows(NegativeException.class, () -> MyCalculator.power(-1, 5));
//			assertEquals("One of the values is negative", e.getMessage());
//			 e=assertThrows(NegativeException.class, () -> MyCalculator.power(-1, -5));
//				assertEquals("One of the values is negative", e.getMessage());
//				 e=assertThrows(NegativeException.class, () -> MyCalculator.power(1, -5));
//					assertEquals("One of the values is negative", e.getMessage());
//			
//		}


}

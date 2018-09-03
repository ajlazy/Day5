package com.capgemini.com.Day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.com.Day6.Car;
import com.capgemini.com.Day6.Cellphone;
import com.capgemini.com.Day6.Laptop;
import com.capgemini.com.Day6.School;
import com.capgemini.com.Day6.Television;

class CarTest {

	@Test
	void carTest() {
		ArrayList<Car> Car1=new ArrayList<Car>();
		assertEquals(true, Car1.add(new Car("tata","hi",2010,122)));
	
	}
	@Test
	void cellphoneTest() {
		ArrayList<Cellphone> Cellphone1=new ArrayList<Cellphone>();
		assertEquals(true, Cellphone1.add(new Cellphone("nokia", "N8", "fast", "Symbian", 25000)));
	
	}
	@Test
	void laptopTest() {
		ArrayList<Laptop> laptop1=new ArrayList<Laptop>();
		assertEquals(true, laptop1.add(new Laptop("DELL", "Inspiron", "Windows", "i5")));
	
	}
	@Test
	void schoolTest() {
		ArrayList<School> School1=new ArrayList<School>();
		assertEquals(true, School1.add(new School("VIS", "Delhi", "Dwarka", 2)));
	
	}
	@Test
	void televisionTest() {
		ArrayList<Television> Television1=new ArrayList<Television>();
		assertEquals(true, Television1.add(new Television("SONY","LCD",true, 1000000)));
	
	}

}

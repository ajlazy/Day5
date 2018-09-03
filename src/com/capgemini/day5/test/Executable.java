package com.capgemini.day5.test;

import com.capgemini.com.day5.question1.MyCalculator;

@FunctionalInterface
public interface Executable {
	public void execute();
}
Executable e=new Executable() {
	@Override
	public void execute() {
		MyCalculator.power(0, 0);
	}
};
	}


//Executable e=()->MyCalculator.pow(0,0);
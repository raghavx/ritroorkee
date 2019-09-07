package com.ritroorkee;

public class Calculator {

	private CalculatorModes mode;

	public Calculator() {
		this.mode = CalculatorModes.BASIC;
	}

	public int add(int a, int b) {
		return a + b;
	}
	// Add a behaviour to substract two numbers

	public int substract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}
}

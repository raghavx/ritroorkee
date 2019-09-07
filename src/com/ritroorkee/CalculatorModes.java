package com.ritroorkee;

public enum CalculatorModes {

	BASIC(true), SCIENTIFIC(false), 
	PROGRAMMER(false);
	
	private boolean free;

	private CalculatorModes(boolean free) {
		this.free = free;
	}
}

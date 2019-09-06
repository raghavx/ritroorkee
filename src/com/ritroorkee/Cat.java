package com.ritroorkee;

import java.awt.Color;

public class Cat {
	private int eyes;
	private Color color;
	private int legs;
	private int tail;
	
	public int getEyes() {
		return eyes;
	}
	
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	
	public void talk() {
		System.out.println("Meow");
	}
	
	public void drink() {
		System.out.println("Drink milk");
	}
}

package com.ritroorkee;

public class Student {

	private String name;
	private long roll;

	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	private void study() {
	}

	private void play() {
	}

	public void declareResult() {
		System.out.println("Result received by student " + name);
	}
}

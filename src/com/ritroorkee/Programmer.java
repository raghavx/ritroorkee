package com.ritroorkee;

public class Programmer extends Employee {

	private IPrinter printer;

	public void doWork() {
		System.out.println("Programmer do work");
	}

	public void setPrinter(IPrinter printer) {
		this.printer = printer;

	}
}

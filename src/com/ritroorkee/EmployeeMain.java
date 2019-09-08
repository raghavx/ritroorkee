package com.ritroorkee;

public class EmployeeMain {

	public static void main(String[] args) {
		// Anonymous inner class 
		Employee e = new Employee() {
			@Override
			public void doWork() {
				System.out.println("Employee do work");
			}
		};

		IPrinter printer = new IPrinter() {
			@Override
			public void print() {
				System.out.println("Generic printer");
			}
		};
	}
}

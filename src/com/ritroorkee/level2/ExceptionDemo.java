package com.ritroorkee.level2;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			System.out.println("In Try block");
			throw new Exception();
		}catch(Exception ex) {
			System.out.println("In Catch block");
			throw new RuntimeException();
		}finally {
			System.out.println("In Finally block");
		}
	}

}

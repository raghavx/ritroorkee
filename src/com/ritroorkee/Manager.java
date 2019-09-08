package com.ritroorkee;

public class Manager extends Employee implements
Cloneable, Comparable<Manager> 
{

	@Override
	public void doWork() {
		System.out.println("Manager do work");
	}

	@Override
	public int compareTo(Manager o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

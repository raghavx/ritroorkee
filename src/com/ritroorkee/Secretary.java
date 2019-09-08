package com.ritroorkee;

public class Secretary extends Employee implements Comparable<Secretary> {

	private final int id;

	public Secretary(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public void doWork() {
		System.out.println("Secretary do work");
	}

	@Override
	public int compareTo(Secretary o) {

		return o.id - id;
	}

}

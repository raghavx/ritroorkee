package com.ritroorkee;

public class Secretary extends Employee implements Comparable<Secretary> {

	private final int id;
	private final String name;

	public Secretary(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
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

		return id - o.id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " name: "+name+",   id: "+id;
	}

}

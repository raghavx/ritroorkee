package com.ritroorkee;

public class Secretary extends Employee implements Comparable<Secretary> {

	private final int id;
	private final String name;
	private final String dept;

	public Secretary(int id, String name, String dept) {
		this.id = id;
		if (dept == null) {
			throw new RuntimeException("Dept cannot be null ");
		}

		this.name = name;

		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getDept() {
		return dept;
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
		return " name: " + name + ",   id: " + id + ",   dept :" + dept;
	}

}

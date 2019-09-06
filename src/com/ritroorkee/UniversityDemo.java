package com.ritroorkee;

public class UniversityDemo {

	public static void main(String[] args) {

		University u = new University();
		u.addDepartment(new Department());
		u.addDepartment(new Department());
		u.addDepartment(new Department());
		u.addDepartment(new Department());
		u.addDepartment(new Department());
		
		u.declareResult();
	}
}

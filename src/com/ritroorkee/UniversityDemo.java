package com.ritroorkee;

public class UniversityDemo {

	public static void main(String[] args) {

		University u = new University();
		Department cse = new Department("CSE", 1);
		u.addDepartment(cse);
		
		Student s = new Student("Raghav",1);
		cse.addStudent(s);
		s = new Student("Xyz",2);
		cse.addStudent(s);
		
		u.declareResult();
	}
}

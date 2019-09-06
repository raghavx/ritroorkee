package com.ritroorkee;

import java.util.List;

public class Department {

	private String name;
	private int numOfFac;
	
	private List<Student> students;
	
	public int numOfStudents() {
		return students.size();
	}
	public void declareResult() {
		System.out.println("Declare result");
	}
	public void conductClasses() {
	}
	
	

	public void internalExams() {
	}

	public void feedback() {
	}

	public void conductAttendance() {
	}


}

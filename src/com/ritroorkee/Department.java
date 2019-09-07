package com.ritroorkee;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int numOfFac;
	
	private List<Student> students;
	public Department() {
		this.students = new ArrayList<Student>();
	}
	public int numOfStudents() {
		return students.size();
	}
	public void declareResult() {
		for(Student s : students) {
			s.declareResult();
		}
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

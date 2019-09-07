package com.ritroorkee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Department {
	private int id;
	private String name;
	private int numOfFac;
	
	private List<Student> students;
	public Department() {
		this.students = new LinkedList<Student>();
	}
	
	public Department(String name, int id) {
		this.students = new ArrayList<Student>();
		this.name = name;
		this.id = id;
	}
	
	public Department(int id) {
		this.id = id;
	}
	
	public Department(String name) {
		this.name = name;
	}
	
	public int numOfStudents() {
		return students.size();
	}
	public void declareResult() {
		for(Student s : students) {
			s.declareResult();
		}
	}
	
	public void addStudent(Student s) {
		this.students.add(s);
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

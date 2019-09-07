package com.ritroorkee;

import java.util.ArrayList;
import java.util.List;
// defining a class 
public class University {
	// instance variable 
	private List<Department> departments;
	
	// constructor 
	public University() {
		this.departments = new ArrayList<Department>();
	}
	// method 
	public void addDepartment(Department d) {
		this.departments.add(d);
	}
	
	public void declareResult() {
		for(Department d : departments) {
			d.declareResult();
		}
	}
}

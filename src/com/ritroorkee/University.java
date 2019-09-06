package com.ritroorkee;

import java.util.ArrayList;
import java.util.List;

public class University {

	private List<Department> departments;
	
	public University() {
		this.departments = new ArrayList<Department>();
	}
	
	public void addDepartment(Department d) {
		this.departments.add(d);
	}
	
	public void declareResult() {
		
	}
}

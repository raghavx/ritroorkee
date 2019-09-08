
package com.ritroorkee;

public class Main {

	public static void main(String[] args) {
		Employee e = new Manager();
		e.doWork();
		e = new Secretary(1,"Name", "dept");
		e.doWork();
	}

}

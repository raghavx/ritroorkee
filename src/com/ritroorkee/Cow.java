package com.ritroorkee;

// sub class 
public class Cow extends Animal {
	private int id;
	public Cow(String name, int id) {
		//super(name);
	}
	@Override
	public void talk() {
		//super.talk();
		System.out.println("   Cow talks");
	}
	
	public void talk(int a) {
		
	}
}

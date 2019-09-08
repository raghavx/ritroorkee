package com.ritroorkee.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ritroorkee.Secretary;

public class ComparisionMain {

	public static void main(String[] args) {
		List<Secretary> ss = new ArrayList<Secretary>();

		Secretary aman = new Secretary(22, "XAman", "HR");
		ss.add(aman);

		Secretary sx = new Secretary(1, "Sikha", "HR");
		ss.add(sx);

		Secretary maurya;
		try {
			// https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html
			maurya = new Secretary(3, "Maurya G", null);
			ss.add(maurya);
		} catch (Exception e) {
			
		}

		maurya = new Secretary(4, "Luv G", "Mech");
		ss.add(maurya);

		maurya = new Secretary(5, "Pooja G", "Mech");
		ss.add(maurya);

		maurya = new Secretary(10, "Sandeep G", "Mech");
		ss.add(maurya);

		maurya = new Secretary(7, "Deepa G", "CSE");
		ss.add(maurya);

		ss.forEach(s -> System.out.println(s));
		System.out.println("----------------");
		Collections.sort(ss, 
				Comparator.comparing(Secretary::getDept)
				.thenComparing(Secretary::getName));
		ss.forEach(s -> System.out.println(s));

	}
}

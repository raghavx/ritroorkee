package com.ritroorkee.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ritroorkee.Secretary;

public class ComparisionMain {

	public static void main(String[] args) {
		List<Secretary> ss = new ArrayList<Secretary>();

		Secretary aman = new Secretary(22, "XAman");
		ss.add(aman);

		Secretary sx = new Secretary(1, "Sikha");
		ss.add(sx);

		Secretary maurya = new Secretary(3, "Maurya G");
		ss.add(maurya);
		ss.forEach(s -> System.out.println(s));
		Collections.sort(ss, new Comparator<Secretary>() {
			@Override
			public int compare(Secretary o1, Secretary o2) {
				return o2.getName().compareTo(o1.getName());
			}

		});
		;
		System.out.println("----After SOrt---");
		ss.forEach(s -> System.out.println(s));

	}
}

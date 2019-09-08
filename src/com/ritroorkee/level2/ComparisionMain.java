package com.ritroorkee.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ritroorkee.Secretary;

public class ComparisionMain {

	public static void main(String[] args) {
		List<Secretary> ss = new ArrayList<Secretary>();

		Secretary aman = new Secretary(22);
		ss.add(aman);
		
		Secretary sx = new Secretary(1);
		ss.add(sx);

		Secretary maurya = new Secretary(3);
		ss.add(maurya);
		ss.forEach(s -> System.out.println(s.getId()));
		Collections.sort(ss);
		System.out.println("----After SOrt---");
		ss.forEach(s -> System.out.println(s.getId()));

	}
}

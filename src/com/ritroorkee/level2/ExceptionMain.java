package com.ritroorkee.level2;

import java.io.File;
import java.io.IOException;

public class ExceptionMain {

	public static void main(String[] args) {

		File f = new File("training.txt");
		if (f.exists()) {
			System.out.println("File exists");
		} else {
			System.out.println("Doesn't exits");
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

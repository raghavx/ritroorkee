package com.ritroorkee.level2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionMain {

	public static void main(String[] args) {

		File f = new File("training.txt");
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(f);
			writer.println("This is a text");
		} catch (FileNotFoundException e) {

		} finally {
			if (writer != null) {
				writer.close();
			}
		}
		System.out.println(f.getAbsolutePath());
	}

}

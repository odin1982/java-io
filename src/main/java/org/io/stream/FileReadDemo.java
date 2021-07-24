package org.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\pruebas\\java-io.txt");
		FileInputStream fis = null;
		
		fis = new FileInputStream(file);
		System.out.println("Total bytes file: " + fis.available());
		int content;
		
		while((content = fis.read()) != -1) {
			System.out.print((char)content);
		}
	}
}

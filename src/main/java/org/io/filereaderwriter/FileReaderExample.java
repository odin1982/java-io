package org.io.filereaderwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) {
		File infile = new File("C:\\pruebas\\java-io.txt");
		FileReader fr = null;
		try {
			fr = new FileReader(infile);
			int ch;
			while((ch =fr.read())!= -1) {
				System.out.println((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
   			e.printStackTrace();
		}
	}
}

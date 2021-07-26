package org.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		byte b1[] = {'A','B'};
		
		try {
			fos = new FileOutputStream("C:\\pruebas\\java-io.txt");
			fos.write(b1);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

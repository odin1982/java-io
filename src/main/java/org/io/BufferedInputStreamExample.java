package org.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\pruebas\\java-io.txt");
		BufferedInputStream b2 = new BufferedInputStream(fin);
		int ch;
		
		while((ch=b2.read())!=-1) {
			System.out.println((char)ch);
		}
	}

}

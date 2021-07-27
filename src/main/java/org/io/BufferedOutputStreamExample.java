package org.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("C:\\pruebas\\java-io.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fout);
		String s = "Hola mundo";
		byte b[] = s.getBytes();
		bos.write(b);
		bos.close();
		fout.close();
	}
}

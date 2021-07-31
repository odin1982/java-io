package org.io.bytearrayoutputstream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author odina
 * Escribe el valor 124 en ascci a los dos archivos a1 y a2 
 */
public class ByteArrayOutputStreamExample {
	public static void main(String[] args) throws IOException {
		FileOutputStream f1 = new FileOutputStream("C:\\pruebas\\a1.txt");
		FileOutputStream f2 = new FileOutputStream("C:\\pruebas\\a2.txt");
		
		ByteArrayOutputStream b1 = new ByteArrayOutputStream();
		b1.write(124);
		b1.writeTo(f1);
		b1.writeTo(f2);
		b1.flush();
		b1.close();
	}
}

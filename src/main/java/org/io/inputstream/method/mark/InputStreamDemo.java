package org.io.inputstream.method.mark;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
	public static void main(String[] args) throws IOException {
		InputStream is = null;
		
		try {
			// new input stream created
			is = new FileInputStream("C://pruebas//test.txt");
			
			// read and print characters one by one
			System.out.println("Char : "+(char)is.read());
			System.out.println("Char : "+(char)is.read());
			System.out.println("Char : "+(char)is.read());
			
			// mark is set on the input stream
			is.mark(10);
			
			System.out.println("Char : "+(char)is.read());
			System.out.println("Char : "+(char)is.read());
			
			if(is.markSupported()) {
				
				// reset invoked if mark() is supported
				is.reset();
				System.out.println("Char : "+(char)is.read());
				System.out.println("Char : "+(char)is.read());
			}
			
		} catch(Exception e) {
			// if any I/O error occurs
			e.printStackTrace();
		} finally {
			// releases system resources associated with this stream
			if(is!=null)
				is.close();
		}
	}
		
	}


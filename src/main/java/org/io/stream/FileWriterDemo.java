package org.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		File file = new File("C:\\pruebas\\java-io.txt");
		File file2 = new File("C:\\pruebas\\java-io2.txt");
		
		try ( FileInputStream fis = new FileInputStream(file);
			  FileOutputStream fos =new FileOutputStream(file2)){
			int content;
			
			while((content = fis.read()) != -1) {
				fos.write(content);
			}
			System.out.println("File copied sucessfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

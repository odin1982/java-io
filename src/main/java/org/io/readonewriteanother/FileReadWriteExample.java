package org.io.readonewriteanother;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {
	public static void main(String[] args) throws IOException {
		File infile = new File("C:\\pruebas\\a1.txt");
		File ofile = new File("C:\\pruebas\\a2.txt");
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(infile);
			fw = new FileWriter(ofile);
			int ch;
			
			while((ch = fr.read())!=-1) {
				fw.write(ch);
			}
		}catch(IOException e) {
			
		}finally {
			fr.close();
			fw.close();
		}
	}
}

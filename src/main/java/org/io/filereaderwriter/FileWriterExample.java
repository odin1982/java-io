package org.io.filereaderwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) throws IOException {
		File outfile = new File("C:\\pruebas\\java-io-file-writer.txt");
		FileWriter fout = null;
		try {
			fout = new FileWriter(outfile);
			String s = "Hola mundo con FileWriter";
			fout.write(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
   			e.printStackTrace();
		}finally {
			fout.close();
		}
	}
}

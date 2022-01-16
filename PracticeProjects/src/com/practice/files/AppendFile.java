package com.practice.files;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
public static void main( String[] args ) {
	try {
		FileWriter writer = new FileWriter("D://filepath//testFile2.txt", true);
		writer.write("   appending to this file   ");
				writer.close();
				System.out.println("done");
		} 
		catch (IOException e) {
		e.printStackTrace();
		}
		}
}

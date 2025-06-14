package org.javaStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		
		// Stream Connectivity
		File f = new File(System.getProperty("user.dir")+"/src/main/java/org/javaStreams/myfile.txt");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter writer = new BufferedWriter(fw);
		
		// Writing inside the file
		writer.write("First Line");
		writer.newLine();
		writer.write("USA");
		writer.newLine();
		writer.write("Kunal");

		// Close stream
		writer.close();
	}
	
}

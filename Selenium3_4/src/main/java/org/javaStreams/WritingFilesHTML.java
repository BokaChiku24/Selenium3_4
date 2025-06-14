package org.javaStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFilesHTML {
	
	public static void main(String[] args) throws IOException {
		File f = new File(System.getProperty("user.dir") + "/src/main/java/org/javaStreams/HTMLTest.html");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter writer = new BufferedWriter(fw);
		writer.write("<html><body><title>Kunal Chavan</title><h1>Learning Java</h1></body></html>");
		writer.close();
		
	}

}

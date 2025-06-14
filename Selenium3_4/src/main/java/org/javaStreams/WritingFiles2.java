package org.javaStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles2 {

	public static void main(String[] args) throws IOException {

		// Stream Connectivity
		File f = new File(System.getProperty("user.dir") + "/src/main/java/org/javaStreams/file.txt");
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter writer = new BufferedWriter(fw);

		// Writing inside the file
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				int num = (int) (Math.random() * 100);
				writer.write(num + "\t");
			}
			writer.newLine();
		}
		// Close stream
		writer.close();
	}

}

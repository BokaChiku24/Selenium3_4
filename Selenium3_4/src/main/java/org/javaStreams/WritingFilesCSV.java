package org.javaStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFilesCSV {

	public static void main(String[] args) throws IOException {
		File f = new File(System.getProperty("user.dir") + "/src/main/java/org/javaStreams/csvTest.csv");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				int num = (int) (Math.random() * 1000);
				bw.write(num + ",");
			}
			bw.newLine();
		}
		bw.close();
	}

}

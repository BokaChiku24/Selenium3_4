package org.javaStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {

	public static void main(String[] args) {
		String line = null;
		try {
			File f = new File(System.getProperty("user.dir") + "/src/main/java/org/javaStreams/myfile.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			// To read only single line 
			System.out.println(br.readLine());
			// while loop is used to read all lines..
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Unable to read the file");
			System.out.println(e.getMessage());
		}

	}

}

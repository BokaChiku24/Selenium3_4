package org.readNotepad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotePad {

	public static void main(String[] args) throws IOException {

		File f = new File(System.getProperty("user.dir")+"/src/main/java/org/readNotepad/Notepad.txt");
		f.createNewFile();
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Please write inside this file");
		bw.newLine();
		bw.write("This is my second line");
		bw.flush();
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		String value = null;
		while((value=br.readLine())!=null) {
			System.out.println(value);
		}
	}

}

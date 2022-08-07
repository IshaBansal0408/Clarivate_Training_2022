package day05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling03 {
	public static void main(String[] args) throws IOException {
		String path1 = "C:\\Users\\bansa\\Desktop\\Java-Programming-Github-Rep\\Text Files\\TextFile03.txt";
		File f = new File(path1);
	
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello there");
		bw.newLine();
		bw.write("Hello but in new line!");
		bw.flush();
		bw.close();
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String filetext = br.readLine();
		while(filetext!=null) {
			System.out.println(filetext);
			filetext = br.readLine();
		}
		br.close();
	}
}

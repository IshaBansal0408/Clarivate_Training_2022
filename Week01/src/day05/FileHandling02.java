package day05;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling02 {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\bansa\\Desktop\\Java-Programming-Github-Rep\\Text Files\\TextFile02.txt";
		File f = new File(path);
		
		//create an object for filr writer
		FileWriter fw =  new FileWriter(f);
		
		//use the write method
		fw.write("I am the writer and ");
		fw.write("I am manupulating the file!"); 
		// pull the text
		fw.flush();
		//close the file
		fw.close();
		
		FileReader fr = new FileReader(f);
		int filetext = fr.read();
		// if no element is available to read then read function will return -1
		while(filetext!=-1) {
			//System.out.println(filetext); //ascii values
			System.out.print((char)filetext);
			filetext = fr.read();
		}
		fr.close();
	}


}

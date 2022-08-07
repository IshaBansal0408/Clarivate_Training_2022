package day05;

import java.io.*;

public class FileHandling01 {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\bansa\\Desktop\\Java-Programming-Github-Rep\\Text Files\\TextFile01.txt";
		File f = new File(path);
		System.out.println("Does File Exist?" + f.exists());
		System.out.println("Can I read the file? "+f.canRead());
		System.out.println("Can I write in the file? "+f.canWrite());
		System.out.println("Name of file : "+f.getName());
		System.out.println("Parent of file : "+f.getParent());
		System.out.println("Absolute Path of file : "+f.getAbsolutePath());
		System.out.println("Is this a file? "+f.isFile());
		System.out.println("Is this a folder? "+f.isDirectory());
		
		String path1 = "C:\\Users\\bansa\\Desktop\\Java-Programming-Github-Rep\\Text Files\\TextFile02.txt";
		File f1 = new File(path1);
		f1.createNewFile();
	}
}

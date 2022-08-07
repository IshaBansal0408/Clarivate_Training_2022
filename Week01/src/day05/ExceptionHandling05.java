package day05;

import java.io.*;

public class ExceptionHandling05 {
	public static void main(String[] args) {
		try {
			FileReader f1 = new FileReader("Hello.txt");
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
	}
}

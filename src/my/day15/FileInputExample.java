package my.day15;

import java.io.*;

public class FileInputExample {
	public static void main(String[] args) {
		FileInputStream fi = null;
		FileOutputStream fa = null;
		try {
			 fi = new FileInputStream("C:\\\\Users\\\\user\\\\Desktop\\\\javatxtTest.txt");
			//fa = new FileOutputStream("C:\\\\Users\\\\user\\\\Desktop\\\\javatxtTest.txt");
			
			byte[] b = new byte[6];
			fi.read(b);

			for (byte b2 : b) {
				System.out.println(b2 + " ");

			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
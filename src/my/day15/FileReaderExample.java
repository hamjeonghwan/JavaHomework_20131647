package my.day15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String args[]) { 
		 try {
			 FileReader fr = new FileReader("C:\\\\Users\\\\user\\\\Desktop\\\\javatxt.txt");
			 int a; 
			 while ((a = fr.read())!=-1) {
				System.out.print((char)a); 
			 }
		 } catch (FileNotFoundException e) {
			 System.out.println("파일이 없습니다.");
			 e.getMessage();
		 } catch (IOException e) {
			 System.out.println("오류입니다.");
		 }
	}
}

		
		

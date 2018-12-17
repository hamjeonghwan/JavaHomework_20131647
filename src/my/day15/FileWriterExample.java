package my.day15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String args[]) {
		try {
			FileReader fr = new FileReader("C:\\\\Users\\\\user\\\\Desktop\\\\javatxt.txt");
			FileWriter fre = new FileWriter("C:\\\\Users\\\\user\\\\Desktop\\\\javatxtcopy.txt");
			int a;
			while ((a = fr.read()) != -1) {
				fre.write(a);

				// System.out.print((char)a);
			}
			System.out.println("완료");
			fre.close();
			fr.close();

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.getMessage();
		} catch (IOException e) {
			System.out.println("오류입니다.");
		}
	}
}

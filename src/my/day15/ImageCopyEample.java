package my.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ImageCopyEample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원본파일의 이름을 입력하세요: ");
		String name = sc.next();
		System.out.println("복사파일의 이름을 입력하세요: ");
		String copyname = sc.next();

		try {
			FileInputStream fi = new FileInputStream(name);
			FileOutputStream fa = new FileOutputStream(copyname);

			int a;
			while ((a = fi.read()) != -1) {
				fa.write(a);
			}
			fi.close();
			fa.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(name + "을" + copyname + "으로 복사하였습니다.");
	}
}
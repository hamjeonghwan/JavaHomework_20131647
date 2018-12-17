package my.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ImageCopyEample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� �̸��� �Է��ϼ���: ");
		String name = sc.next();
		System.out.println("���������� �̸��� �Է��ϼ���: ");
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
		System.out.println(name + "��" + copyname + "���� �����Ͽ����ϴ�.");
	}
}
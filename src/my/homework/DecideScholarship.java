package my.homework;
import java.util.*;
public class DecideScholarship {
	public static void main(String[] args) {
	Double gpa;
	Scanner s = new Scanner(System.in);
	System.out.println("평점을 입력하세요: ");
	 gpa = s.nextDouble();
	 
	 if (gpa >= 4.3) {
		 System.out.println("전액 장학금이다");
	 } else if (gpa >= 4.0 && gpa <4.3) {
		 System.out.println("반액 장학금이다");
	 } else if (gpa >= 3.7 && gpa <4.0) {
		 System.out.println("모범 장학금이다");
		 } else {
			 System.out.println("받을 수 없다");
		 }	 	 	 
	 	}
	}
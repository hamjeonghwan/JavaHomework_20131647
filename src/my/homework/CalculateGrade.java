package my.homework;
import java.util.*;
public class CalculateGrade {
		public static void main(String[] args) {
	      int attendrate;
	      int totalscore;
	      String grade = null;
	      Boolean cheating;
	      
	      Scanner s = new Scanner(System.in);
	      
	      System.out.println("�������� ���θ� �Է��Ͻÿ�.");
	      cheating = s.nextBoolean();
	      System.out.println("�⼮���� �Է��Ͻÿ�.");
	      attendrate = s.nextInt();
	      System.out.println("������ �Է��Ͻÿ�.");
	      totalscore = s.nextInt();
	      
	      if(cheating == false) {
	         if (attendrate >= 80) {
	            totalscore = totalscore/10;
	            switch(totalscore) {
	               case 9 : grade = "A"; break; 
	               case 8 : grade = "B"; break; 
	               case 7 : grade = "C"; break; 
	               case 6 : grade = "D"; break; 
	               default : grade = "F"; break;
	            }
	         }else {
	            grade = "F";
	         } 
	      }else {
	         grade = "F";
	      }
	      System.out.println("���� : " + (String)grade);
	   }
	}
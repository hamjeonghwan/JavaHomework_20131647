package my.homework;
import java.util.*;
public class TaxiFare {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	   int fare;
       int income = 0;
       
       for(int i= 0; i<10; i++) { 
    	   System.out.print("����� �Է��ϼ���.");
    	   fare =s.nextInt();
    	   income = income + fare; 
       }
       System.out.println("�հ�� "+income+"�Դϴ�.");
	}
}
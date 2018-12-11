package comsm;
import java.util.Scanner;

public class Comsm1 {

	public static void main(String[] args) {
		 int result;
		  int i = 2152;
		  int a = 9463;
		  int step = 10000;
		  Scanner sc = new Scanner(System.in);
		  
		  for (int index = 1; index <= 10000; i++) {
			  
		  result = (int) Math.pow(i, 2);
		  i = a * i;
		  
		  int next = (result / 100) % 10000;
		  System.out.println(next);
		  i = next;
		  sc.nextLine(); 
		  } 
	}
}

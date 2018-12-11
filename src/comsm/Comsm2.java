package comsm;
import java.util.Scanner;

public class Comsm2 {
	static final int i = 2152;

	public static void main(String[] args) {
		 int result;
		  int c = 9463;
		  int d = 10000;
		  Scanner sc = new Scanner(System.in);
		  
		 
		  for (int index = 1; index <= 10000; index++) {
		  	  
		  result = (i * c) % d;
		  
		  System.out.print(result);
		  c = result;
		  sc.nextLine();  	
		  }
	}
}
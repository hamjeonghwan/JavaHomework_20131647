package comsm;
import java.util.*;
	
public class Comsm8 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("몇 개의 난수를 발생시키겠습니까?\n");
		int n = scan.nextInt();
			
		System.out.print("최소값은 얼마로 하시겠습니까?\n");
		int m = scan.nextInt();
			
		System.out.print("최대값은 얼마로 하시겠습니까?\n");
		int a = scan.nextInt();
			
		Random random = new Random();
	
		for(int i = 0; i < n; i++){
			System.out.println(random.nextDouble());
			}
		}
	}
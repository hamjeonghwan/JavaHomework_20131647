package my.day07;
import java.util.*;
public class AA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];
		Random rand = new Random();
		for(int i = 0; i<arr.length; i++){
		arr[i] = rand.nextInt(100)+1;
		}
		int sum=0;
		
		for(int i = 0; i<arr.length; i++ ) {
			sum+=arr[i];
		}
		 System.out.printf("100개의 랜덤 정수의 평균 값은 " + (sum /100) + "입니다") ;
		}
	}
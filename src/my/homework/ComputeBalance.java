package my.homework;
import java.util.*;
public class ComputeBalance {
	  public static void main(String[] args) {
	      int purchaseAmount;
	      int balance;
	      Scanner s = new Scanner(System.in);
	      System.out.println("���űݾ��� �Է��Ͻÿ�.");
	      purchaseAmount = s.nextInt();
	      
	      if (purchaseAmount >= 300000) {
	         balance = purchaseAmount - 30000;
	      }else if(purchaseAmount >= 100000 && purchaseAmount < 300000) {
	         balance = purchaseAmount - 5000;
	      }else {
	         balance = purchaseAmount;
	      }  
	      System.out.println("���űݾ� : " + purchaseAmount);
	      System.out.println("û���ݾ� : " + balance);
	   }
	}
package my.homework;
import java.util.*;
public class ComputeBalance {
	  public static void main(String[] args) {
	      int purchaseAmount;
	      int balance;
	      Scanner s = new Scanner(System.in);
	      System.out.println("구매금액을 입력하시오.");
	      purchaseAmount = s.nextInt();
	      
	      if (purchaseAmount >= 300000) {
	         balance = purchaseAmount - 30000;
	      }else if(purchaseAmount >= 100000 && purchaseAmount < 300000) {
	         balance = purchaseAmount - 5000;
	      }else {
	         balance = purchaseAmount;
	      }  
	      System.out.println("구매금액 : " + purchaseAmount);
	      System.out.println("청구금액 : " + balance);
	   }
	}
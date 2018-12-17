package my.day15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class HangMan {
	   static String solution;
	   int index;
	   String[] w_key;
	   static final int MAX = 10;
	   Random random;
	   Scanner scan;
	   
	   public  HangMan() throws Exception { 
		   random = new Random();
		   w_key= new String[MAX];
		   FileReader fr = new FileReader("C:\\\\Users\\\\user\\\\Desktop\\\\javatxt.txt");
		   BufferedReader br = new BufferedReader(fr);
		   scan = new Scanner(br);
		   int i;
		   
		   for(i=0; i <MAX; i++) {
			   if(scan.hasNext() == false) break;
			   w_key[i] = scan.nextLine();
		   }
		   index = i;
		   solution = getWord();
	   }
	   private String getWord() {
		// TODO Auto-generated method stub
		return w_key[random.nextInt(index)];
	}
	static boolean check(String s, StringBuffer a, char ch) {
	      for(int i = 0; i < s.length(); i++) {
	          if(s.charAt(i) == ch)
	             a.setCharAt(i, ch);
	       }
	       for(int i = 0; i < s.length(); i++)
	          if(s.charAt(i) != a.charAt(i)) {
	             return false;
	          }
	       return true;
	    }
	   public static void main(String[] args) {
	   
	      char ch;
	      Scanner scan = new Scanner(System.in);
	      String[] words = {"java", "count", "school", "book"," student", "programmer"};
	      int count = words.length;
	      int index = (new Random()).nextInt(count);
	      solution = words[index];
	  
	      StringBuffer answer = new StringBuffer(solution.length());
	      int i = 0;
	      for(i = 0; i < solution.length(); i++) 
	         answer.append(' ');
	      for(i = 0; i < solution.length(); i++) {
	       if(solution.charAt(i) != ' ')
	         answer.setCharAt(i, '_');
	         }
	     
	   while(true) {
		  System.out.println("글자 수 : " + solution.length());
	      System.out.println("현재의 상태 :" + answer);
	      System.out.print("글자를 추측하세요 : ");
	      String c =scan.next();
	      if(check(solution, answer, c.charAt(0)) == true)
	         break;
	   }
	   System.out.print("현재의 상태 " + answer);
	   }
	
}

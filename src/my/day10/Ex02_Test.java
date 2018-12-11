package my.day10;
import java.util.*;
public class Ex02_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Random r = new Random();
		  System.out.println(r.nextInt(100)+1);   
		  
		  StringTokenizer st= new StringTokenizer("013-4014014-04104", "-");
		  while (st.hasMoreTokens()) {
			  System.out.println(st.nextToken());
		  }
		  String[] s="013-4014014-04104".split("-");
		  for(String t: s) {
			  System.out.println(t);
		  }
		  Calendar c= Calendar.getInstance();
			System.out.println(c);
			System.out.println(c.get(Calendar.YEAR) + "³â");
			System.out.println(c.get(Calendar.MONTH)+1 + "¿ù");
			System.out.println(c.get(Calendar.DATE) + "ÀÏ");
			
			Ex02_Test et=new Ex02_Test();
			System.out.println(et.getClass());
	}
}
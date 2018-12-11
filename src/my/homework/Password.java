package my.homework;
import java.util.*;
public class Password {
	public static void main(String[] args) {
		String  password = "myongji60";
		String input;
		int trynumber = 0;
		Scanner s = new Scanner(System.in);
		
		 do {
			System.out.print("암호를 입력하세요");
			input =s.nextLine();
			
			if (!input.equals(password)) {
				System.out.println("암호를 틀렸습니다");
			}
			else {
				System.out.println("환영합니다");
				break;
			}
		 } while(++trynumber < 3);
		 
		 if (trynumber == 3) {
			 System.out.println("접속을 거부합니다");
		 }
	}
}
package my.homework;
import java.util.*;
public class Password {
	public static void main(String[] args) {
		String  password = "myongji60";
		String input;
		int trynumber = 0;
		Scanner s = new Scanner(System.in);
		
		 do {
			System.out.print("��ȣ�� �Է��ϼ���");
			input =s.nextLine();
			
			if (!input.equals(password)) {
				System.out.println("��ȣ�� Ʋ�Ƚ��ϴ�");
			}
			else {
				System.out.println("ȯ���մϴ�");
				break;
			}
		 } while(++trynumber < 3);
		 
		 if (trynumber == 3) {
			 System.out.println("������ �ź��մϴ�");
		 }
	}
}
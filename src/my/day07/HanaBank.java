package my.day07;

public class HanaBank {
	public static void main(String[] args) {
	      Account o = new Account();
	      o.setRegNumber(11111);
	      o.setName("Tom");
	      o.setBalance(10000);
	      System.out.println("�̸��� " + o.getName() + " ���� �ܰ�� " + o.getBalance() + "�Դϴ�.");
	      System.out.println("���´� " + o.getRegNumber());
	   }
	}
package my.day07;

public class HanaBank {
	public static void main(String[] args) {
	      Account o = new Account();
	      o.setRegNumber(11111);
	      o.setName("Tom");
	      o.setBalance(10000);
	      System.out.println("이름은 " + o.getName() + " 통장 잔고는 " + o.getBalance() + "입니다.");
	      System.out.println("계좌는 " + o.getRegNumber());
	   }
	}
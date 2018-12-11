package my.day07;

public class CarManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c =new Car();
		c.speedUp();
		c.speedUp();
		System.out.println(c.getCurrentSpeed());
		
		c.breakdown();
		System.out.println(c.getCurrentSpeed());
		
		c.color();
		System.out.println(c.color);
	}
}
package my.day07;

public class Car {
	int speed; 
	int distance; 
	int price;
	String color;
	String brand;
	
	public Car() {
		
	}
	public Car(String color, int speed) {
		this.color= color;
		this.speed= speed;
	}
	public Car(String color, int speed, String brand, int distance, int price){
		this(color, speed);
		this.brand= brand;
		this.distance= distance;
		this.price= price;
	}
	public void speedUp(){ 
		speed = speed+5;
	} 
	public void breakdown(){ 
		speed = speed-10;
	}
	public int getCurrentSpeed() {
		return speed;
	}
	 public void color(){ 
		 color = ("»¡°£»ö");			
	}
	 public void brand(){ 
		 brand = ("»ï¼º");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

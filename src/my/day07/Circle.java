package my.day07;

public class Circle {
		int radius;
		void setRadius(int r) {
			radius = r; 
		}
		double calcArea() {
		return 3.14*radius*radius; 
		}	void print() { 
			System.out.println("���� ������: "+radius);
			System.out.println("���� ����: "+calcArea());
			}
		public static void main(String[] args) { 
		
			Circle obj; 
			obj = new Circle();
			obj.setRadius(100);
			obj.print();
	}
}
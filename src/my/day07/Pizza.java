package my.day07;

public class Pizza {
		int size;
		String type;
		
		public Pizza() {
			size = 12; 
			type ="���۽�����";
			
		}
		public Pizza(int s, String t) {
			size = s;
			type =t;
			
		}
	public static void main(String[] args) {
		Pizza o1= new Pizza();
		System.out.println("("+o1.type+" , "+o1.size+",)");
		
		Pizza o2= new Pizza(24, "��������");
		System.out.println("("+o2.type+" , "+o2.size+",)");
		
		Pizza o3= new Pizza(28, "�Ұ��");
		System.out.println("("+o3.type+" , "+o3.size+",)");
	}
}
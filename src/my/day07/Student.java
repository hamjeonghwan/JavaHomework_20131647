package my.day07;

public class Student {
	private int rollno;
	private String name;
	private int age;
	
	public int getrollno() {
	      return rollno;
	   }
	   public void setrollno(int rollno) {
	      this.rollno=rollno;
	   }
	   public String getname() {
	      return name;
	   }
	   public void setname(String name) {
	      this.name = name;
	   }
	   public int getage() {
	      return age;
	   }
	   public void setage(int age) {
	      this.age = age;
	   }   
	   
	   public static void main(String[] args) {
		   	  Student o = new Student();
		      o.setrollno(20131647);
		      o.setname("Han");
		      o.setage(20);
		      System.out.println("�л��� �̸��� " + o.getname() +  "�Դϴ�.");
		      System.out.println("�л��� �й��� " + o.getrollno() +  "�Դϴ�.");
		      System.out.println("�л��� ���̴� " + o.getage() +  "�Դϴ�.");     
	   }
}
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
		      System.out.println("학생의 이름은 " + o.getname() +  "입니다.");
		      System.out.println("학생의 학번은 " + o.getrollno() +  "입니다.");
		      System.out.println("학생의 나이는 " + o.getage() +  "입니다.");     
	   }
}
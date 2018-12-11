package my.day09;

public class Person {
	private String name;
	private String address;
	
	public Person(String name, String addr) {
		this.name = name;
		address=addr;
	}
	public void showInfo() {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("이름 " + name);
		System.out.println("주소 " + address);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
	}
	
}
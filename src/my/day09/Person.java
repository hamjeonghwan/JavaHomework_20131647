package my.day09;

public class Person {
	private String name;
	private String address;
	
	public Person(String name, String addr) {
		this.name = name;
		address=addr;
	}
	public void showInfo() {
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.println("�̸� " + name);
		System.out.println("�ּ� " + address);
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
	}
	
}
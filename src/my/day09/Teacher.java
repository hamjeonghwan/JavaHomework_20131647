package my.day09;

public class Teacher extends Person {
	String tID;
	String tSudtect;

	public Teacher(String name, String addr) {
		super(name, addr);	
	}
	public Teacher(String name, String addr, String id, String sud) {
		super(name, addr);	
		tID= id;
		tSudtect= sud;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("tID " + tID);
		System.out.println("tSudtect" + tSudtect);
	}
	public String getId() {
		return tID;
	}
}
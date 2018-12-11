package my.day09;

public class Staff extends Person{
	String sID;
	public Staff(String name, String addr, String sID) {
		super(name, addr);
		this.sID = sID;
	}
	public String getsId() {
		return sID;
	}
}
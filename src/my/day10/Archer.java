package my.day10;

public class Archer extends Hero{
	public void  fireArrow(){
		System.out.println("불화살쏘기");
	}
	@Override
	public void attack() {
		System.out.println("대지지르기");
	}
}
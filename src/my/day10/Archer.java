package my.day10;

public class Archer extends Hero{
	public void  fireArrow(){
		System.out.println("��ȭ����");
	}
	@Override
	public void attack() {
		System.out.println("����������");
	}
}
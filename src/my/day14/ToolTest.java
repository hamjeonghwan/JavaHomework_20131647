package my.day14;

class ToolBox<V1, V2> {
	public V1 tool1;
	public V2 tool2;
}
class Driver {
	String n= "����̹�";
}
class Hammer {
	String n= "���Ը�";
}
class Spanner {
	String n= "��Ű�����";
}

class CBox<B1> {
	public B1 c1;
	
}
class Candy {
	String a = "��������";
}
public class ToolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToolBox<Driver, Hammer> Box = new ToolBox <Driver, Hammer>();
		CBox<Candy> cbox = new CBox<Candy>();
		Box.tool1 = new Driver();
		Box.tool2 = new Hammer();
		cbox.c1 = new Candy();
		
		System.out.println(Box.tool1.n);
		System.out.println(Box.tool2.n);
		System.out.println(cbox.c1.a);
	}
}

package my.day09;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] person= new Person[2];
		person[0]= new Teacher("ȫ�浿", "����������", "010", "�ڹ�");
		person[1]= new Staff("ȫ�浿", "�����������絿", "111");
		
		for(int i= 0; i< person.length; i++) {
			person[i].showInfo();
			if(person[i] instanceof Teacher) {
				Teacher t =(Teacher)person[i];
				System.out.println("����"+ t.getId());
			}else if(person[i] instanceof Staff) {
				Staff t =(Staff)person[i];
				System.out.println("����"+ t.getsId());
				
			}
		}
	}
}
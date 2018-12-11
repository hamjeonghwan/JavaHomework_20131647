package my.day09;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] person= new Person[2];
		person[0]= new Teacher("홍길동", "대전동구용운동", "010", "자바");
		person[1]= new Staff("홍길동", "대전동구가양동", "111");
		
		for(int i= 0; i< person.length; i++) {
			person[i].showInfo();
			if(person[i] instanceof Teacher) {
				Teacher t =(Teacher)person[i];
				System.out.println("정보"+ t.getId());
			}else if(person[i] instanceof Staff) {
				Staff t =(Staff)person[i];
				System.out.println("정보"+ t.getsId());
				
			}
		}
	}
}
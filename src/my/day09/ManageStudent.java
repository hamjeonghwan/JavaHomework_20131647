package my.day09;

public class ManageStudent {
	
	public static Student[ ] addStudent(){ 
		Student[ ] student = new Student[3];  
		student[0] = new Student("Lim");  
		student[1] = new Student("Min");   
		student[2] = new Student("Sook", "Daejeon", "010-111-1111", "sook@a.b");  
		return student; 
	}
	public void printStudents(Student [] student) {
		for (int i=0; i<student.length; i++) {
			
			System.out.println(student[i]);
		}
	}
	public static void main(String[] args) {
		ManageStudent m =new ManageStudent();
		Student[] student;
		student = addStudent();
		m.printStudents(student);
	}
}
package my.day07;
import java.util.*;
public class Profile {
		String name;
		int age;
	public void setName(String str) {
			name = str;
		}
	public void setage(int val) {
			age = val;
		}
	public void printname() {
		System.out.println(name);
	}
	public void printage() {
		System.out.println(age);
	}
	
	public static void main(String[] args) { 
		Profile profile = new Profile();
		
		profile.setName("My name is MIN");
		profile.setage(20);
		
		profile.printname();
		profile.printage();
	}
}
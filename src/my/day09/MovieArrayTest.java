package my.day09;

import java.util.Scanner; 

public class MovieArrayTest { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); 
		Movie[] list= new Movie[2]; 
		for(int i=0;i < list.length; i++) { 
			System.out.print("��ȭ����: "); 
			String title = scanner.nextLine(); 
			System.out.print("��ȭ����: "); 
			String director = scanner.nextLine(); 
			list[i] = new Movie(title, director); 
			} 
		for(int i=0;i < list.length; i++) { 
			System.out.print("{ "+list[i].title+", "+list[i].director +" } "); 
			} 
		} 
	}
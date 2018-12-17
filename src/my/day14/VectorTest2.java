package my.day14;

import java.util.*;

class Monster {
	String name;
	double hp;

	public Monster(String name, double hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
		return "{" + name + "," + hp + "}";
	}
}

public class VectorTest2 {
	public static void main(String args[]) {
		Vector<Monster> list = new Vector<>();
		list.add(new Monster("��ȣ", 100));
		list.add(new Monster("����", 200));
		list.add(new Monster("���־�", 300));
		
		System.out.println("������ ũ��: " + list.size());
		System.out.print(list);
	}
}
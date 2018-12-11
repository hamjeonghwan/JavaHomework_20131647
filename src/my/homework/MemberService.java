package my.homework;
import java.util.ArrayList;
import java.util.Scanner;

class Member {
	String id, pw;

	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
}

public class MemberService {
	private static ArrayList<Member> arr_member = new ArrayList<Member>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean exit_check = true;

		while (exit_check) {
			System.out.println("0:����, 1:ȸ������, 2:�α���, 3:ȸ������");
			System.out.print("�Է� : ");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
			case 0:
				exit_check = false;
				break;
			case 1:
				sign();
				break;
			case 2:
				login();
				break;
			case 3:
				view_members();
				break;
			default:
				System.out.println("���� �׸��Դϴ�.");
			}
		}
	}

	public static void sign() {
		String id, pw;
		boolean usedID_check;
		do {
			usedID_check = false;
			System.out.print("id�� �Է��ϼ��� : ");
			id = scanner.nextLine();

			for (Member member : arr_member) {
				if (member.id.equals(id)) {
					usedID_check = true;
					System.out.println("�̹� �����ϴ� ���̵� �Դϴ�");
					break;
				}
			}
		} while (usedID_check);

		System.out.print("pw�� �Է��ϼ��� : ");
		pw = scanner.nextLine();

		arr_member.add(new Member(id, pw));
		System.out.println(id + "�� ȸ������� �Ϸ�Ǿ����ϴ�.");
	}

	public static void login() {
		if (arr_member.size() == 0) {
			System.out.println("ȸ���� �������� �ʽ��ϴ�.");
			return;
		}
		String id, pw;
		boolean usedID_check, usedPW_check;
		Member member = null;
		do {
			usedID_check = true;
			System.out.print("id�� �Է��ϼ��� : ");
			id = scanner.nextLine();

			for (Member memberID : arr_member) {
				if (memberID.id.equals(id)) {
					usedID_check = false;
					member = memberID;
					break;
				}
			}

			if (usedID_check) {
				System.out.println("�������� �ʴ� ���̵� �Դϴ�");
			}
		} while (usedID_check);

		do {
			usedPW_check = true;

			System.out.print("pw�� �Է��ϼ��� : ");
			pw = scanner.nextLine();

			if (member.pw.equals(pw)) {
				usedPW_check = false;
				break;
			}

			if (usedPW_check) {
				System.out.println("��й�ȣ�� ���� �ʽ��ϴ�");
			}
		} while (usedPW_check);
	}

	public static void view_members() {
		for (Member member : arr_member) {
			System.out.println("id : " + member.id + "\tpw : " + member.pw);
		}
	}
}

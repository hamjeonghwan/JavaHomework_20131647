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
			System.out.println("0:종료, 1:회원가입, 2:로그인, 3:회원정보");
			System.out.print("입력 : ");
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
				System.out.println("없는 항목입니다.");
			}
		}
	}

	public static void sign() {
		String id, pw;
		boolean usedID_check;
		do {
			usedID_check = false;
			System.out.print("id를 입력하세요 : ");
			id = scanner.nextLine();

			for (Member member : arr_member) {
				if (member.id.equals(id)) {
					usedID_check = true;
					System.out.println("이미 존재하는 아이디 입니다");
					break;
				}
			}
		} while (usedID_check);

		System.out.print("pw를 입력하세요 : ");
		pw = scanner.nextLine();

		arr_member.add(new Member(id, pw));
		System.out.println(id + "님 회원등록이 완료되었습니다.");
	}

	public static void login() {
		if (arr_member.size() == 0) {
			System.out.println("회원이 존재하지 않습니다.");
			return;
		}
		String id, pw;
		boolean usedID_check, usedPW_check;
		Member member = null;
		do {
			usedID_check = true;
			System.out.print("id를 입력하세요 : ");
			id = scanner.nextLine();

			for (Member memberID : arr_member) {
				if (memberID.id.equals(id)) {
					usedID_check = false;
					member = memberID;
					break;
				}
			}

			if (usedID_check) {
				System.out.println("존재하지 않는 아이디 입니다");
			}
		} while (usedID_check);

		do {
			usedPW_check = true;

			System.out.print("pw를 입력하세요 : ");
			pw = scanner.nextLine();

			if (member.pw.equals(pw)) {
				usedPW_check = false;
				break;
			}

			if (usedPW_check) {
				System.out.println("비밀번호가 옳지 않습니다");
			}
		} while (usedPW_check);
	}

	public static void view_members() {
		for (Member member : arr_member) {
			System.out.println("id : " + member.id + "\tpw : " + member.pw);
		}
	}
}

package ch04.ex04;

import java.util.Scanner;

public class C04Characters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = "";
		boolean isGood = false;
		do {
			System.out.print("아이디를 입력하세요: ");
			words = sc.nextLine();
			isGood = words.matches("[a-zA-Z]*") && words.length() > 0;
			if (!isGood) System.out.println("아이디는 알파벳 문자만 입력가능합니다.");
			else System.out.println("입력에 성공하였습니다.");
		} while(!isGood);
		
	}
}

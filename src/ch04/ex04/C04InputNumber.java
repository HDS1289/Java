package ch04.ex04;
/*
 * 번호가 입력된다
 * 번호가 입력될 때 한 자리 숫자가 아니라 여러 자리 숫자이면??
 * 번호가 입력되지 않고 문자가 입력된다면??
 */

import java.util.Scanner;

public class C04InputNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		int length = 0;
		boolean isGood = false;
		do {
			System.out.print("번호를 입력하세요: ");
			input = sc.nextLine();
			length = input.length();
			if (!input.matches("[0-9]*")) {
				System.out.println("문자를 입력할 수 없습니다.");
			} else {
				if (length == 1) {
					System.out.println("입력이 완료되었습니다.");
					break;
				} else System.out.println("한 자리 숫자만 입력 가능합니다.");
			}	
		} while(!isGood);
	}
}

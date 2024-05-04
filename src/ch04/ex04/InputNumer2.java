package ch04.ex04;

import java.util.Scanner;

public class InputNumer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		String errMsg = "ERROR]";
		int num = 0;
		do {
			System.out.print("입력: ");
			input = sc.nextLine();
			if (input == "") {
				System.out.println(errMsg + " 1 이상의 숫자를 입력하세요.");
			} else if (input.matches("[0-9]*")) {
				num = Integer.parseInt(input);
				if (num > 9 || num == 0) System.out.println(errMsg + " 1 이상의 한 자리 숫자만 가능합니다.");
			} else System.out.println(errMsg + " 1 이상의 숫자를 입력하세요.");
		} while (!(1 <= num && num <= 9));
		System.out.println("입력이 완료되었습니다.");
	}
}

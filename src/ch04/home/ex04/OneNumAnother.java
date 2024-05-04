package ch04.home.ex04;

import java.util.Scanner;

public class OneNumAnother {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean isGood = false;
		
		do {
			System.out.print("> ");
			input = sc.nextLine();
			isGood = input.matches("[1-9]");
			if (!isGood) System.out.println("ERROR] 한 자리의 자연수만 입력 가능합니다.");
		} while(!isGood);
	}
}

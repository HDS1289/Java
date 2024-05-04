package ch04.ex04;
/*
 * HR JAVA app
 * 한 글자만이 입력되어야만 하는데, 여러 글자가 입력되는 경우,
 * 번호를 입력해야 하는데 엔터, 스페이스 등이 입력될 경우
 * 거짓된 데이터가 들어가는 것에 대한 예외처리.
 */
import java.util.Scanner;

public class C04IntLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = "";
		int length = 0;
		do {
			System.out.print("한 글자를 입력하세요: ");
			words = sc.nextLine();
			length = words.length();
			if (length > 1) System.out.printf("%d글자를 입력하였습니다.\n", length);
			else System.out.println("입력에 성공하였습니다.");
		} while (length != 1);
	}
}

package ch02.home;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자: ");
		char ch = sc.next().charAt(0);
		
		int unicode = (int)ch;
		
		System.out.println(ch + "의 Unicode는 " + unicode + "입니다.");
	}
}

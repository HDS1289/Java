package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		sc.nextLine();
		
//		System.out.print("문자를 입력하세요: ");
//		String str = sc.nextLine();
//		System.out.printf("%s을 입력하였습니다. \n", str);
		
		/*
		System.out.print("숫자를 입력하세요: ");
		int i = sc.nextInt();
		System.out.println(i + "을 입력하였습니다.");
		
		System.out.print("숫자를 입력하세요: ");
		int j = sc.nextInt(); sc.nextLine();
		System.out.println(j + "을 입력하였습니다.");
		
		System.out.print("문자열을 입력하세요: ");
		String babyName = sc.nextLine();
		System.out.println(babyName + "을 입력하였습니다.");
		*/
		
		System.out.print("문자를 입력하세요: ");
		char c = sc.nextLine().charAt(0);
		System.out.printf("%s을 입력하였습니다.", c);
	}
}

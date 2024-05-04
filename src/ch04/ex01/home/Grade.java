package ch04.ex01.home;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int oneDigit = 0;
		int tenDigit = 0;
		String grade = "";
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		// +와 -가 붙기 위한 조건은 어떻게 구현할 것인가?
		tenDigit = score / 10; // int 10으로 나눈 몫.
		oneDigit = score % 10; // int 10으로 나눈 나머지.
		// 정수의 자릿수를 몫과 나머지로 표현 가능하다.
//		if (98 <= score && score <= 100) System.out.println("A+");
//		else if (score >= 94) System.out.println("A");
//		else if (score >= 90) System.out.println("A-");
//		else if (score >= 88) System.out.println("B+");
//		else if (score >= 84) System.out.println("B");
//		else if (score >= 80) System.out.println("B-");
//		else System.out.println("C");
		
		if (tenDigit >= 9) grade = "A";
		else if (tenDigit >= 8) grade = "B";
		else grade = "C";
		
		if (score >= 80) {
			if (oneDigit >= 8 || tenDigit == 10) grade += "+";
			else if (0 <= oneDigit && oneDigit < 4) grade += "-";
		}
		
		System.out.println(grade);
	}
}

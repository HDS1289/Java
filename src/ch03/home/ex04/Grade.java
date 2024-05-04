package ch03.home.ex04;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int totScore = 0;
		double mean = 0;
		String grade = "";
		
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
		
		totScore = kor + eng + math;
		
		// mean = (int)(totScore / 3.0 * 10) / 10.0;
		mean = totScore / 3.0;
		
		grade = (90 <= mean && mean <= 100) ? "A" : (mean >= 80) ? "B" : "C";
		
		System.out.printf("\n총점: %d\n", totScore);
		System.out.printf("평균: %.1f\n", mean);
		System.out.printf("학점: %s\n", grade);
	}
}

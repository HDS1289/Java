package ch04.ex04;
/*
 * while의 반복 횟수는 0회 이상이다.
 * do-while의 반복 횟수는 1회 이상이다.
 */

import java.util.Scanner;

public class C04DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int result = 0;
		
		do {
			System.out.print("a: ");
			a = sc.nextInt();
			
			System.out.print("b: ");
			b = sc.nextInt();
			
			result = a + b;
			System.out.printf("%d + %d = %d\n", a , b, result);
		} while(result != 0);
	}
}

package ch03.home.ex04;

import java.util.Scanner;

public class Sum { // 입력받으려면 입력장치를 생성해야한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int sum = 0;
		
		System.out.print("a: ");
		a = sc.nextInt();
		System.out.print("b: ");
		b = sc.nextInt();
		
		sum = a + b;
		
		System.out.printf("%d + %d = %d", a, b, sum);
	}
}

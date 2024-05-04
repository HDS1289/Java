package ch02.home;

import java.util.Scanner;

public class H02Replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		System.out.print("a >");
		num1 = sc.nextInt();
		System.out.print("b >");
		num2 = sc.nextInt();
		
		System.out.printf("a: %d, b: %d\n", num1, num2);
		
		int tmp = 0;
		tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.printf("a: %d, b: %d\n", num1, num2);
		
	}
}

package ch03.home.ex04;

import java.util.Scanner;

public class Adjust {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = 0;
		double adjust = 0;
		
		System.out.print("x: ");
		x = sc.nextDouble();
		
		adjust = x - x % 1.0; // casting operator나 Math api를 사용하면 안 되는 알고리즘이다.
		System.out.println(adjust); // casting operator나 Math api를 사용할 수는 있다.
	}
}

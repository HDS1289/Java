package ch03.ex05;

public class C01Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c);
		
		c = a * b; // overflow가 일어난 것이다.
		System.out.println(c);
		
		c = (long)a * b;
		System.out.println(c);
		
		int x = a * b / a;
		x = a / b * a;
		System.out.println(x);
	}
}

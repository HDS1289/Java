package ch02.ex01;

public class C04Assign {
	public static void main(String[] args) {
		int a = 1; // variable은 data를 하나만 가질 수 있다.
		int b = 2;
		
		System.out.printf("a: %d, b: %d\n", a, b);
		
		a = b;
		System.out.printf("a: %d, b: %d\n", a, b);
		
		a = b + 1; // +연산자가 3이라는 data를 return 하였다.
		System.out.printf("a: %d, b: %d\n", a, b);
		
		double d = Math.random();
		
		System.out.printf("%f", d);
	}
}

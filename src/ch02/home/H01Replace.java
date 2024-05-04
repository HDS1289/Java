package ch02.home;

public class H01Replace {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		System.out.printf("a: %d, b: %d\n", a, b);
		
		int tmp = 0;
		tmp = a;
		a = b;
		b = tmp;
		
		System.out.printf("a: %d, b: %d\n", a, b, args);
	}
}

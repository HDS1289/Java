package ch03.ex03;

public class Bitwise { // 비트 논리 부정 연산자(비트전환 연산자) '~'
	public static void main(String[] args) {
		int x = 10;
		x = ~x;
		System.out.println(x);
		
		int y = 23;
		y = ~y + 1;
		System.out.println(y);
		
		int z = -20;
		z = ~z + 1;
		System.out.println(z);
		
		int a = 10;
		System.out.println("0000000000000000000000000000" + Integer.toBinaryString(a));
		a = ~a;
		System.out.println(Integer.toBinaryString(a));
		
		int b = 22;
		System.out.printf("%s, %d\n","000000000000000000000000000" + Integer.toBinaryString(b), b);
		
		b = ~b;
		System.out.printf("%s, %d\n", Integer.toBinaryString(b), b);
	}
}

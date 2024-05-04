package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false; // boolean type의 기본값이다.
		
		b = true && true;
		b = (2 > 1) && (2 > 1);
		b = 1 > 2 && 2 > 1;
		b = 1 > 2 || 2 > 1; // 둘 중 하나만 true인 것을 boolean type으로 저장하여 return 한다.
		b = 2 > 1 || 2 > 1; // 두 비교값 모두 true이기 때문에 true값을 저장한다.
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 & ++y < 0; // 느린 연산자의 특성상 모든 피연산자에 대하여 연산을 수행한다.
		
		x = 0;
		y = 0;
		b = ++x < 0 && ++y < 0; // 빠른 연산자의 특성상 하나의 피연산자에서 false값이 나오는 순간 연산을 중단한다.
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y < 0; // 빠른 연산자의 특성상 논리합(or)에서는 한 개의 true값이, 논리곱(and)에서는 한 개의 false값이 return 되는 순간 연산을 멈춘다.

		x = 0;
		y = 0;
		b = ++x > 0 | ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b", x, y, b);
	}
}

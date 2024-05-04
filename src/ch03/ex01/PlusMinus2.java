package ch03.ex01;

public class PlusMinus2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		
		x++;
		++x;
		System.out.println(x);
		
		y--;
		--y;
		System.out.println(y);
		
		int z = ++x + y++; // x는 참조하기 전에 1증가를 실행하고 y는 참조한 후에 1증가를 실행하였다.
		// 참조할 당시에는 x는 13이라는 literal을 가지고 있었고, y는 8이라는 literal을 가지고 있었다.
		// 따라서 덧셈 연산자에 의하여 21이라는 값이 constant로 저장되었고, z라는 변수에 의하여 복사된 것이다.
		System.out.printf("x: %d, y: %d, z: %d\n", x, y, z);
		
		z = 0;
		
		z = ++x;
		System.out.println("z: " + z);
		System.out.println("x: " + x);
		
		z = x++;
		System.out.println("z: " + z);	
		System.out.println("x: " + x);
	}
}

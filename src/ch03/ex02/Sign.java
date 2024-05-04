package ch03.ex02;

public class Sign { // +은 피연산자에 1을 곱하고, -는 피연산자에 -1을 곱한다.
	public static void main(String[] arg) {
		int x = 10;
		x = -x;
		System.out.println(x);
		
		int y = -20;
		y = -y;
		System.out.println(y);
		
		int z = -30;
		z = +z;
		System.out.println(z);
		
		z = -z;
		System.out.println(z);
	}
}

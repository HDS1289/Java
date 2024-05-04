package ch03.ex10;

public class C02Final {
	public static void main(String[] args) {
		int MAX = 3; //variable을 대문자로 모두 표현하였다 ==> 할당한 뒤로 바꾸지 않겠다.
		MAX = 1; // 그러나 얼마든지 접근할 수 있다.
		
		final int TALL = 3;
		
		double area = 0;
		area = 3.14 * 3 * 3;
		
		double PI = 3.14;
		
		int r = 3;
		
		area = PI * r * r;
	}
}

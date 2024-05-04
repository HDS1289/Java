package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		int x = 10; // 일상적으로는 decimal의 형태가 익숙하다.
		System.out.println(Integer.toBinaryString(x)); // int형태의 data는 비트수가 32개이다.
		
		x = 0b1010; // 2진수로 표현된 정수형 데이터이다. 접두사로 0b를 사용한다.
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA; // 16진수로 나타낸 데이터이다. 0x를 접두사로 한다.
		System.out.println(Integer.toBinaryString(x));
		
		x = 012; // 8진수의 형태이다. 0을 접두사로 한다.
		System.out.println(Integer.toBinaryString(x));
		
		int y = 0x7;
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010;
		System.out.println(Integer.toBinaryString(x));
		
		y = 1_234_567;
		System.out.println(y + 1);
		
		double z = 1e1; // 1.0 * 10^1 ==> 10의 거듭제곱 리터럴이다.
		System.out.println(z);
	}
}

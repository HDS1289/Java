package ch02.ex04;

public class C01Overflow {
	public static void main(String[] args) {
		byte b = 10;
		int i = b;
		
		i = (int)b;
		System.out.println(i); // byte type에서 int type로 promotion이 일어났다.
		
		int i2 = 300; // int type인 정수형을 할당받을 i2를 선언한다.
		byte b2 = (byte)i2;
		System.out.println(b2); // 비트 수의 overflow가 일어나서 값에 대한 왜곡이 일어났다.
	}
}

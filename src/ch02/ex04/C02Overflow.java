package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
//		byte b = 128; ==> byte type에서의 최댓값보다 더 큰 수를 할당하려 하면 오류가 발생한다.
		byte b = 127;
		
//		b = b + 1;
		
		b++; // 1을 증가시킨다. ==> overflow가 일어나서 -128이 된다.
		b++; // -127이 된다.
		System.out.println(b);
	}
}

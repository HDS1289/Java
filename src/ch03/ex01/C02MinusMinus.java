package ch03.ex01;

public class C02MinusMinus {
	public static void main(String[] args) {
		int i = 0;
		i--;
		System.out.println(i);
		
		--i;
		System.out.println(i);
		
		i = 0;
		int j = i--; // 참조 후에 1을 감소시킨다.
		System.out.printf("%d, %d\n", j, i);
		
		i = 0;
		j = --i; // 1을 감소시킨 후에 다른 변수에도 할당(참조)한다.
		System.out.printf("%d, %d\n", j, i);
	}
}

package ch04.ex05;

public class C01For {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println(); // 줄바꿈이다.
		
		for(int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i - 1 + " ");
		}
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "번 ");
		}
	}
}

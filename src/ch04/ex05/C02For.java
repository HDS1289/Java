package ch04.ex05;

public class C02For {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		for(int i = 0; i < 100; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 1; i <= 100; i += 2) {
			System.out.print(i - 1 + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			if(i % 4 == 0 && i != 0) {
				System.out.print(i + " ");
			}
		}
	}
}

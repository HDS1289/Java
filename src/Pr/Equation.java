package Pr;

public class Equation {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				x = i;
				y = j;
				if (4 * x + 5 * y == 60) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}	
		}
	}
}

package ch04.home.ex05;

public class Game369Failed {
	public static void main(String[] args) {
		String str = " ";
		for(int i = 0; i <= 9; i++) {
			System.out.println();
			for(int j = 0; j <= 9; j++) {
				if (i == 0) {
					System.out.printf("%d%s", j, str);
					if (j % 3 == 0 && j != 0) System.out.print("짝");
				} else if (j + 1 == 10)
					System.out.printf("%d%d", i + 1, 0);
					if (i % 3 == 0 && i != 0) System.out.print("짝");
				else if (i >= 1)
					System.out.printf("%d%d ", i, j + 1);
			}
		}
	}
}

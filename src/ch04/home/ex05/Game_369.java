package ch04.home.ex05;

public class Game_369 {
	public static void main(String[] args) {
//		for(int i = 0; i <= 9; i++) {
//			for(int j = 0; j <= 9; j++) {
//				System.out.printf(" %d%d", i, j);
//				if (j == 0) System.out.println();
//				if (i % 3 == 0 && i != 0) System.out.print("짝");
//				if (j % 3 == 0 && j != 0) System.out.print("짝");
//			}
//		}
		int tenDigit = 0;
		int oneDigit = 0;
		for(int i = 1; i <= 99; i++) { // 숫자 전체를 출력하고 난 후에 
			System.out.print(" " + i);
			tenDigit = i / 10;
			oneDigit = i % 10;
			
			if (tenDigit % 3 == 0 && tenDigit > 0) System.out.print("짝");
			if (oneDigit % 3 == 0 && oneDigit > 0) System.out.print("짝");
			if (oneDigit == 0) System.out.println();
		}
	}
}

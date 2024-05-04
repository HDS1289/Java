package Pr;

public class Dice {
	public static void main(String[] args) {
		int dice1 = 0;
		int dice2 = 0;
		boolean isGood = false;
		while (!isGood) {
			dice1 = (int)(Math.random() * 6) + 1;
			dice2 = (int)(Math.random() * 6) + 1;
			System.out.printf("(%d, %d)\n", dice1, dice2);
			isGood = (dice1 + dice2 == 5);
			if (isGood) break;
			else continue;
		}
	}
}

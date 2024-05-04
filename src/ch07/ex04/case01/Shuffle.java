package ch07.ex04.case01;

public class Shuffle {
	public static void main(String[] args) {
		int[] cards = new int[5];
		
		for(int i = 0; i < cards.length; i++) cards[i] = i;
		
		for(int card: cards) {
			System.out.print(card + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int idx = (int)(Math.random() * (cards.length - 1)) + 1;
			
			int tmp = 0;
			tmp = cards[idx];
			cards[idx] = cards[0];
			cards[0] = tmp;
		}
		
		for(int card: cards) System.out.print(card + " ");
		
	}
}

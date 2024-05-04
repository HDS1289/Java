package ch07.home.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Card[] cards = new Card[5];
		
		for(int i = 0; i < cards.length; i++) cards[i] = new Card(i + 1);
		
		for(Card card: cards) System.out.print(card + " ");
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int idx = (int)(Math.random() * (cards.length - 1)) + 1;
			
			Card tmp = null; // 임시 저장 공간을 지정한다.
			tmp = cards[idx]; // card[idx]를 임시 저장 공간에 저장한다.
			cards[idx] = cards[0]; // card[idx]에 card[0]을 저장한다.
			cards[0] = tmp; // card[0]에 tmp를 저장한다.
		}
		
		for(Card card: cards) System.out.print(card + " ");
	}
}

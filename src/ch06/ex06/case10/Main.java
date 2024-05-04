package ch06.ex06.case10;

public class Main {
	public static void main(String[] args) {
		BusCard card = new BusCard() {
			
			@Override
			public void tagOn() {
				System.out.println("tag on.");
			}
			
			@Override
			public void tagOff() {
				System.out.println("tag off");
			}
		};
		card.tagOn();
		card.tagOff();
	}
}

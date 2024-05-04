package ch07.ex01.case08;

public class Clerk {
	private String flowerName;
	
	public Flower sell(String flowerName) {
		Flower flower = switch(flowerName) {
		case "장미" -> new Rose();
		case "백합" -> new Lily();
		default -> null;
		};
		
		return flower;
	}
}

package ch06.ex01.case03;

public class Main {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Leopard leopard = new Leopard();
		
		lion.run();
		lion.shout();
		
//		lion.eat();
		
		leopard.run();
//		leopard.shout();
		leopard.eat();
	}
}

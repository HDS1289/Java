package ch06.ex01.case01;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();
		lion.run(); // 메소드가 중복이 된다.
	}
}

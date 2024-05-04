package ch06.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Shoes shoes = new Shoes(1000);
		
		System.out.printf("%d", shoes.price);
		// shoes 객체의 datatype은 Shoes이다.
		// Shoes 클래스의 price가 사용된 것이다.
	}
}

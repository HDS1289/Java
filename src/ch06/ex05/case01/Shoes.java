package ch06.ex05.case01;

public class Shoes extends Product {
	public int price;
	
	public Shoes(int price) {
		super(price * 2); // product 객체의 price이다.
		this.price = price;
	}
}

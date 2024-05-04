package ch07.ex05.case01;

import ch07.ex05.case01.Apple;
import ch07.ex05.case01.Basket;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> basket = new Basket<Apple>(); // generic type의 결정을 new로 할 수 있다.
		
		basket.set(new Apple());
		System.out.println(basket.get());
		
		Basket<Grape> basket2 = new Basket<Grape>();
		
		basket2.set(new Grape());
		System.out.println(basket2.get());
	}
}

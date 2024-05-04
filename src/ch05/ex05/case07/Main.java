package ch05.ex05.case07;

public class Main {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		// Apple apple = new Apple();
		
		// 농부가 사과를 1,000원에 유통업자에게 팔았다.
		// 유통업자는 그 사과를 2,000원에 팔았다.
		// apple = farmer.sell(1000);
		
		// System.out.println(retailer.sell(apple).getPrice());
		
		retailer.sell(farmer.sell(1000));
	}
}

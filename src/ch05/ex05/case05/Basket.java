package ch05.ex05.case05;
// 사과가 바구니 안에 담겨 있다. ==> 바구니가 사과를 가지고 있다.
public class Basket {
	private Apple apple;
	
	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

package ch07.ex05.case01;

public class Basket<E> { // 아무거나 타입. ==> generic
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}

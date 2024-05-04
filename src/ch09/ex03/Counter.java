package ch09.ex03;

public class Counter {
	private int val;
	
//	public void increase() {
//		this.val++;
//	}
//	
//	public void decrease() {
//		this.val--;
//	}
//	
//	public void print() {
//		System.out.print(this.val + " ");
//	}
	
	public synchronized void increase() {
		this.val++;
	}
	
	public synchronized void decrease() {
		this.val--;
	}
	
	public synchronized void print() {
		System.out.print(this.val + " ");
	}
}

package ch07.ex06.case03;

public class Bowl<T> { // generic class
	private T val;
	
	public void setVal(T val) {
		this.val = val;
	}
	
	public T getVal() {
		return this.val;
	}
}
// generic class의 generic type은 new 할 때 결정해야 한다.
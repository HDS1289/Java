package ch07.ex06.case05;

public class Cabinet<T extends A> { // T에 들어갈 수 있는 타입은 A, B클래스.
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
	
	public <S extends C> S getFinalVal(S[] arr) {
		return arr[arr.length - 1];
	}
}

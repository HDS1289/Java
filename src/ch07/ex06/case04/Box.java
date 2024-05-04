package ch07.ex06.case04;

public class Box { // genetic method
	public <T> T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
}
// 접근제한자 <제너릭타입> 반환값 메소드명(매개변수타입 매개변수)
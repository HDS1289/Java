package ch07.ex01.case02;

public class Main {
	public static void main(String[] args) {
		C c = new C(); // 객체가 생성이 되었다.
		
		B b = c;
		A a = c;
		Object o = c;
		
		c = (C)o;
		c = (C)a;
		c = (C)b;
		
		b = (B)a;
		
		//type 이 바뀌는 것일 뿐이다.
	}
}

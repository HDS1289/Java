package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		
		B b = c; // 부모 인터페이스 타입으로의 promotion이 일어났다.
		A a = c;
		
		c = (C)a; // 강제 캐스팅을 한 것이다.
		c = (C)b;
		
		b = (B)a;
	}
}

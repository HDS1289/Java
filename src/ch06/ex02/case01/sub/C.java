package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A {
	public void test() {
		int x = 0;
		
//		x = this.a;
//		x = this.b;
		x = this.c; // 다른 패키지에 있을지라도 자식 클래스일 경우에 열려 있다. (protected)
		x = this.d;
		
//		this.m1();
//		this.m2();
		this.m3();
		this.m4();
	}
}

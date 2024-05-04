package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {
		A a = new A();
		
		int x = 0;
//		x = a.a;
//		x = a.b;
//		x = a.c; // 다른 패키지에 위치하기 때문에 defaut와 protected모두 접근이 안 된다.
		x = a.d;
		
//		a.m1();
//		a.m2();
//		a.m3();
		a.m4();
	}
}

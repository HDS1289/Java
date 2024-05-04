package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";		
		if(c instanceof C) msg += "C ";
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg += "Object ";
		System.out.println(msg);
		
		B b = new B();
		msg = ""; // 다시 초기화시킨다.(청소작업)
		if(b instanceof C) msg += "C ";
		if(b instanceof B) msg += "B ";
		if(b instanceof A) msg += "A ";
		if(b instanceof Object) msg += "Object ";
		System.out.println(msg);
		
		F f = new F();
		msg = "";
		if(f instanceof A) msg += "A "; // instanceof 연산자는 인터페이스에 대해서는 자유롭게 쓸 수 있다.
		if(f instanceof Object) msg += "Object ";
		System.out.println(msg);
	}
}

package ch07.ex05.case02;

public class AutoBoxing {
	public static void main(String[] args) {
		System.out.println(add(1, 2));
	}
	
	private static int add(Integer a, Integer b) {
		return a + b;
	}
}


// parameter부분은 Integer라는 객체를 표현하고 있다.
// int를 Integer로 boxing하는 것이다 ==> autoboxing
// 객체가 아닌 것을 객체로 만드는 것을 boxing이라 한다.
// Integer객체가 int로 unboxing되어서 int끼리 계산되고 int type으로 return 된다.
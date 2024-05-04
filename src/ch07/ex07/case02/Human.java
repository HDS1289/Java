package ch07.ex07.case02;


@FunctionalInterface
public interface Human {
	void say();
	
	default void sleep() {
		System.out.println("Human sleep.");
	}
	
	static void walk() {
		System.out.println("Human walk.");
	}
}
/*
 * FunctionalInterface에서도 default와 static method를 정의할 수 있다.
 * 한 개만 정의해야 하는 것은 추상 메소드에만 국한되기 때문이다.
 */

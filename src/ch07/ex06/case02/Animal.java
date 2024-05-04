package ch07.ex06.case02;
/*
 * 인터페이스를 만들 적에 알고리즘이 이미 정해져 있을 경우 (공통적인 행동이나 기능 등)
 * default 메소드로 설정하여 자식 클래스에 상속시킬 수 있다.
 * 추상 메소드는 메소드 이름이 같아도 자식 클래스마다의 알고리즘이 다를 경우 설정한다.
 */
public interface Animal {
	default void eat() {
		System.out.println("먹다.");
	} // 자식 클래스에 상속 가능하다.
	
	void move();
}

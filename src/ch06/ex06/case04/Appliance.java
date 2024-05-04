package ch06.ex06.case04;

public interface Appliance { // 상속받는 클래스들의 표준이 된다.
//	public abstract void on(); 컴파일러가 자동으로 public abstract를 추가한다.
//	public abstract void off();
	void on();
	void off(); // 접근 제한자는 public이 기본이다.
}

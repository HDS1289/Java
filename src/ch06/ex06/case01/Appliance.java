package ch06.ex06.case01;

public abstract class Appliance {
	public void on() {}
	public abstract void off();
}

// 일반적인 메소드만 있는 클래스의 경우에는 추상 클래스가 될 수도, 안될 수도 있다.
// 그러나 추상 메소드가 하나 이상 있으면 필연적으로 추상 클래스가 되어야 한다.
package ch06.ex06.case05;

import ch06.ex06.case04.Appliance;

public class Fridge implements Appliance, Electronic { // 추상 메소드가 있는데 일반 클래스로 되어 있기 때문에 error로 처리된다.
	@Override public void on() {}						// 일반 메소드로 오버라이드(재정의)하였기 때문에 error가 아니다.
	@Override public void off() {}
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() { return 0; }
	@Override public String getModelName() { return null; }
}

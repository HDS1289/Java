package ch06.ex06.case05;

import java.time.LocalDate;

// 기본적으로 public static final이 붙는다.
// instance variable은 될 수 없다.
// 인스턴스를 만들지 않는다. new Electronic을 하지 않는다.
public interface Electronic {
	public static final int VOLTAGE = 200;
	static final String MAKER_NAME = "LG";
	LocalDate PRODUCED_DATE = LocalDate.now();
	
	// 메소드의 경우에는 public abstract가 기본적으로 붙는다.
	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
}

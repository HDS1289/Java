package ch07.ex07.case05;

@FunctionalInterface
public interface Janitor<T> {
	void clean(T t); // generic type을 parameter로 하는 추상 메소드이다. 
}
/*
 * ~~을 청소한다 ==> ~~을 에 해당하는 목적어가 generic type이 된다.
 */
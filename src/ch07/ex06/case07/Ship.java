package ch07.ex06.case07;

import java.util.ArrayList;
import java.util.List;

public class Ship { // 배를 설계하는 시점에는 무슨 종류의 컨테이너가 실릴지 정해지지 않았다.
	private List<Container<?>> containers;
	
	public Ship() {
		containers = new ArrayList<>();
	}
	
	public void put(Container<?> container) {
		containers.add(container);
	}
}

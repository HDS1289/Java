package ch07.ex05.case07;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, User> map = new HashMap<>(); // generic에서 key와 value의 type을 모두 결정해준다.
		
		map.put(1, new User("최한석")); // {}의 형태로 출력된다.
		map.put(2, new User("한아름")); // {1=최한석}에서 1이 key가 되고 최한석이 value가 된다.
		map.put(3, new User("양승일"));
		
		
		System.out.println(map);
		
		User user = map.get(1); // parameter에는 key를 넣어준다.
		System.out.println(user);
		System.out.println(map);
		
		user = map.remove(2);
		System.out.println(map);
		System.out.println(user); // collection에서 제거한 value를 출력한다.
		// listArray는 key가 자동할당되고, map은 key를 수동 할당해야 한다.
		// get이나 remove는 출력한다는 데에는 공통점이 있다.
		// get의 경우에는 전체 collection에 변함이 없고(read), remove는 전체 collection에 변화를 준다.(write)
	}
}

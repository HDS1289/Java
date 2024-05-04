package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(); // Interface Set type의 HashSet객체를 생성한다.
		// Integer type임을 결정해준다.
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1); // 중복되는 value를 표현할 길이 없다 ==> key가 없기 때문.
		
		System.out.println(set);
		// set이라는 collection의 경우에는 오직 value만을 중점적으로 본다.
		// key는 고려대상이 아니고, value의 중복을 허용하지 않는다.
		
//		set.remove(3);
//		
//		System.out.println(set);
	}
}

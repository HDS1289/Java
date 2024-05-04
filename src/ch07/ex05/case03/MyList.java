package ch07.ex05.case03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); // 중복 제거를 하기 위하여 괄호만 남긴다 ==> Diamond type;
		
		// 객체 타입은 List type
		// add를 call을 할 수 있다 ==> List type에 add라는 method가 존재한다.
		// 그렇지만 Override된 return값은 자식 객체에서 정의 된 것으로 이뤄진다 (ArrayList);
		list.add(1); // 자동으로 boxing되어서  parameter로 전달된다.
		list.add(2);
		list.add(3);
		list.add(1);
		
		System.out.println(list);
		
		for(int i: list) System.out.print(i + " ");
		System.out.println();
		
		System.out.println(list.get(0));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		list.remove(1); // parameter가 key(index)이다.
		System.out.println(list);
		
		list = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
		
		for(int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		System.out.println(list);
	}
}

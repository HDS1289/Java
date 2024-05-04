package ch07.ex07.case06;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i <= 3; i++) list.add(i);
		
//		for(int i: list) System.out.print(i + " ");
//		System.out.println();
//		
//		
		
		list.forEach((i) -> System.out.print(i + " ")); // Consumer T 이상의 type이 된다.
		System.out.println();
		
		list.forEach((i) -> {
			if(i != 0 && i % 2 == 0)
				System.out.print(i + " ");
		});
	}
}

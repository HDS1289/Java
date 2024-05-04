package ch07.ex06.case06;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pocket pocket = new Pocket();
		List<Number> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		
		list1.add(1); list1.add(2);
		list2.add(1); list2.add(2);
		list3.add(1.0); list3.add(2.0);
		list4.add("a"); list4.add("b");
		
		pocket.printList(list1); // printList에서 와일드카드를 사용했다.
		pocket.printList(list2);
		pocket.printList(list3); 
		pocket.printList(list4);
		
		/*
		 * 와일드카드를 사용했기 때문에
		 * Number, Integer, Double, String type모두 들어갈 수 있다.
		 */
		
		System.out.printf("%.1f\n%.1f\n%.1f",
				pocket.add(list1),
				pocket.add(list2),
				pocket.add(list3));
//				pocket.add(list4)); ==> list4의 경우에는 String type이 들어가 있다.
		// 따라서 add 메소드의 parameter로 들어갈 수 없다.
	}
}

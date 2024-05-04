package ch07.ex06.case06;

import java.util.List;

public class Pocket {
	{
		int i = 1 + 2;
		double d = 1.0 + 2.0;
		i = new Integer(1) + new Integer(2);
		d = new Double(1.0) + new Double(2.0);
		
//		new Number(1) + new Number(2); double인지 int인지 파악은 안 됨.
	}
	
//	public void printList(List<Integer> list) {
//		System.out.println(list);
//	}
	
//	public void printList(List<Number> list) {
//		System.out.println(list);
//	}
	
	public void printList(List<?> list) {
		System.out.println(list);
	}
	
	public double add(List<? extends Number> list) {
		double sum = 0;
		for(Number n: list) sum += n.doubleValue();
		return sum;
	}
	
	public List<? super Integer> add2(List<? super Integer> list) {
		return list;
	}
}

package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		Platanus platanus = new Platanus(); // Tree는 interface이므로 new Tree()를 할 수 없다.
		
		Tree tree = new Platanus(); // platanus 객체는 tree type으로 존재한다.
		
		platanus = (Platanus)tree;
		
		tree = platanus;
		tree = (Tree)platanus;
	}
}

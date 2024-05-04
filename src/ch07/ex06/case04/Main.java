package ch07.ex06.case04;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		
		Integer[] ints = {1, 2, 3};
		String[] strs = {"a", "b", "c"};
		
		int i = box.getLastVal(ints); // method를 호출할 때 generic type이 결정된다.
		String s = box.getLastVal(strs);
		
		System.out.printf("%d, %s", i, s);
	}
}

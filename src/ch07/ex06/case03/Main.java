package ch07.ex06.case03;

public class Main {
	public static void main(String[] args) {
		Bowl<Integer> bowl1 = new Bowl<>(); // 객체별로 generic type이 다르다.
		Bowl<String> bowl2 = new Bowl<>();
		Bowl<Double> bowl3 = new Bowl<>();
		Bowl<Float> bowl4 = new Bowl<>();
		
		bowl1.setVal(324);
		bowl2.setVal("안녕하세요.");
		bowl3.setVal(3.14);
		bowl4.setVal(0.78f);
		
		int i = bowl1.getVal();
		String s = bowl2.getVal();
		double d = bowl3.getVal();
		float f = bowl4.getVal();
		
		
		System.out.printf("%d %s %.2f %.2f", i, s, d, f);
	}
}

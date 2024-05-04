package ch08.ex04.case01;

public class C05Hierachy {
	public static void main(String[] args) {
		try {
			int i = 3 / 0;
		} catch(ArithmeticException e) {
			System.out.println("ERROR] ArithmeticException.");
		} catch(Exception e) {
			System.err.println("ERROR] Exception.");
		}
	}
}

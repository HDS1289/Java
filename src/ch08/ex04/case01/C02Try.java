package ch08.ex04.case01;

public class C02Try {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			int result = arr[10];
			System.out.println(result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR] Index Out of Bounds");
		}
		
		System.out.println("end");
	}
}

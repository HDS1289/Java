package ch08.ex04.case01;

public class C01NoTry {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		int result = arr[10]; // 인덱스 값은 0부터 9까지밖에 없다.
		
		System.out.println(result); // end는 출력되지 않고 그대로 프로그램이 종료된다.
		
		System.out.println("end");
	}
}

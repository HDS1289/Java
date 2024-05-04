package ch02.ex02;

public class C03String {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		// String sumStr = sum + ""; // + 연산자는 붙이기의 역할을 수행한다.
		String sumStr = String.valueOf(sum);
		System.out.printf("%s\n", sumStr);
		
		int i = Integer.parseInt(sumStr); // string type을 int타입으로 바꿀 때 쓰인다.
		
		sumStr = a + b + ""; // 연산자를 실행할 때 먼저 덧셈 연산을 수행한 후 String으로 변환한다.
		System.out.println(sumStr);
		
		sumStr = "" + a + b; // 연산자를 실행할 때 먼저 String으로 변환한 다음 붙이기를 수행한다.
		System.out.printf("%s\n", sumStr);
		
		String dialog = "John said, \"hello\".";
		System.out.println(dialog);
	}
}

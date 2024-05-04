package ch02.ex03;

public class C02DoubleInt {
	public static void main(String[] args) {
		double d = 1.92;
		int i = (int)d; // d라는 variable은 double data를 담고 있으므로, 정수형 data로 강제적으로 casting하는 것이다.
		System.out.println(i); // overflow가 일어나서 1만 출력된다.
		
		double f = Math.floor(d);
		double r = Math.round(d); // 반올림을 실행하는 Api이다.
		System.out.printf("%.2f, %.2f\n", f, r);
		
		int f2 = (int)f; // double type이므로 강제로 casting하게 하는 연산자를 사용해야 한다.
		int r2 = (int)r;
		System.out.printf("%d, %d\n", f2, r2);
	}
}

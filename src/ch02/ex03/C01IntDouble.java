package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0; // 실수 타입중 하나로, 정수형보다 더 많은 것을 표현할 수 있다.
		
		d = i;
		System.out.printf("%f %d\n", d, i);
		
		d = (double)i;
		System.out.printf("%f %d\n", d, i);
		
//		i = d; 큰 수에서 작은 수로 형변환을 할 수 없다.
		
		i = (int)d;
		System.out.printf("%f %d\n", d, i);
				
	}
}

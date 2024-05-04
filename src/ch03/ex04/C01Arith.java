package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		byte c = (byte)(a + b); // 계산을 하기 이전에 a와 b 모두 int type로의 promotion이 일어난다.
		// 따라서 연산을 수행하기 이전에 byte type로 강제 casting을 해야 한다.
		System.out.println(c);
		
//		c = c + 1; ==> c는 byte type이다. 그러나 1이라는 constant는 int type이기 때문에 c도 연산 이전에 promotion이 일어난다.
		
		c++; // promotion이 일어나지 않는다. int로 바꾸는 작업이 없다.
		System.out.println(c);
		
		double d = a / b; // 연산 이전에 a와 b에서 int type로의 promotion이 일어나고 d라는 변수에 할당될 때 그대로 double type으로 변환된다.
		System.out.println(d);
		
		// 나눗셈 결과로 소수까지 적혀 있는 것을 받고 싶다면?
		
		d = (double) a / b; // 피연산자 하나에만 강제적인 casting을 적용해줘도 double도 bit수 측면에서 큰 수이기 때문에 btye에서 promotion이 일어난다.
		// 그 후에 나눗셈 연산이 수행되고 double type인 d에 할당된다.
		System.out.println(d);
		
		d = 1.0 * a / b; // 곱셈 연산자가 우선 실행된다. ==> a의 데이터에서 promotion이 일어나서 3.0이 return된다.
		System.out.println(d); // 나눗셈에서 b의 data가 프로모션이 일어나서 constant값은 1.5로 저장된다.
		// 산술 연산자에서는 피연산자가 같아야 한다. return 값도 피연산자의 datatype에 따라 결정된다.
		
		//왜곡 1
		d = (double)(a / b);
		System.out.println(d);
		
		//왜곡 2
		d = a / b * 1.0;
		System.out.println(d);
	}
}

package ch03.ex07;

public class C01Compare {
	public static void main(String[] args) { // 비교 연산자에 의하여 return되는 값(리터럴)은 true 나 false이다.
		boolean b = 'A' < 'B';
		b = '0' == 0; // character type 0과 int type 0을 비교한다.
		b = 'A' != 65; // 유니코드 값을 비교해서 다르면 false를 출력한다.
		
		b = 10.0 == 10.0f;
		b = 0.1 == 0.1f; // 부동 소수점 ==> double type data와 float type data는 소수점 아래의 값을 저장하는 형태가 정확하지 않다.
		b = (float)0.1 == 0.1f;
		
		System.out.println(b);
	}
}

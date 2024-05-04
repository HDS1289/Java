package ch02.ex02;

public class C02Char {
	public static void main(String[] args) {
		char c = 'A'; // char 타입 리터럴은 single quotation으로 둘러싸인 문자열로 표시된다.
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		//print 함수는 원래는 숫자 타입을 출력해야 하는데, 포맷 부분이 char로 되어 있어서 대문자 A로 변환하여 출력한 것이다.
		//physical적으로는 'A'가 저장된 것이 아니다.
		
		c = 65; // A의 유니코드 값은 65, a의 유니코드 값은 97이다.
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = 0x0041; // 유니코드 값을 16진수로 나타낸 것이다.
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = '\u0041';
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = 0x004C;
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = '\u0064';
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
//		c = '\u0000';
//		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		
	}
}

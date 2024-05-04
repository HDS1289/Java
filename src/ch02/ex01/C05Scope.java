package ch02.ex01;

public class C05Scope {
	public static void main(String[] args) {
		int i = 0;
//		int i = 0; ==> local scope 내에서는 하나의 variable이 유일해야 한다.
		int j = 0;
		
		{ // 별도의 scope를 선언한 것이다.
//			int i = 0; ==> main scope가 존재하는 한에서는 i 변수는 쓸 수 없다.
			int x = 0;
			int y = 0;
		}
	}
}

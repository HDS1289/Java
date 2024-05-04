package ch04.ex01;

public class C01If {
	public static void main(String[] args) {
		int visitedCnt = 0;
		// 어떤 장소에 처음 와봤다.
		// 그 전에는 한 번도 간 적 없다.
		if (visitedCnt < 1) { // '첫 방문이면'을 프로그래밍 언어로 번역하라.
			System.out.println("첫 방문입니다.");
		}
		
		System.out.println(visitedCnt);
		
		if (visitedCnt < 1) 
			System.out.println("첫 방문입니다.");
		
	}
}

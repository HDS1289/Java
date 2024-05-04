package ch04.home;
// 단을 구분을 하려면??
public class Gugudan {
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) { // for 반복문 내부에도 여러 줄의 실행문이 있을 경우 중괄호로 블록 처리 해야 한다.
			System.out.println();
			System.out.printf("------ %d단 ------\n", i);
			for(int j = 1; j <= 9; j++)
				System.out.printf("%d * %d = %d\n", i, j, i * j);
		}
	}
}

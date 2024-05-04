package ch04.ex03;

public class C02DrawingLots {
	public static void main(String[] args) {
		int random = 1;
		int pickCnt = 0;
		
		while (random % 3 != 0) {
			random = (int)(Math.random() * 100) + 1;
			System.out.println(random); // 제비를 뽑는 과정까지 볼 수 있다.
			pickCnt++;
		}
		System.out.printf("%d번 뽑아서 %d를 찾았습니다.", pickCnt, random);
	}
}

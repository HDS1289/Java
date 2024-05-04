package ch04.home.ex03;

public class MoneyCopy {
	public static void main(String[] args) {
		int price = 30000;
		int tot = 0;
		
		while (price > tot) {
			tot += (int)(Math.random() * 30) + 1000;
		}
		
		System.out.printf("총 %d원 꺼냈습니다.", tot); // 각각의 꺼낸 돈의 액수를 볼 수 없다.
	}
}

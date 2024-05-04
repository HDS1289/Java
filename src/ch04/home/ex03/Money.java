package ch04.home.ex03;
/*
 * 돈을 지갑에서 매번 꺼낸다.
 * 물건값은 3만원이다.
 * 지갑에 5만원권은 없다.
 * 한 번씩 꺼낼 때마다 그 꺼낸 금액을 console에 출력해야 한다.
 * 합계가 있어야지 가격과의 비교가 쉽다. ==> 반복의 조건을 설정하기 용이하다.
 * 1000원권, 5000원권, 10000원권만으로 조합되어야 한다.
 */
public class Money {
	public static void main(String[] args) {
		int price = 30000;
		int money = 0;
		int total = 0;
		
		while (total < price) {
			money = ((int)(Math.random() * 30) + 1) * 1000;
			total += money;
			System.out.println(money);
		}
		// 꺼낸 총 금액은 한 번만 확인하면 되기 때문에 반복문을 빠져나온 곳에서 명령어가 작성되어야 한다.
		System.out.printf("총 %d원을 꺼냈습니다.", total);
	}
}

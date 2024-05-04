package ch05.home.ex05.case01;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Man man = new Man(); // 식당에 한 남자가 들어왔다.
		
		man.setManName("최한석");
		man.setAge(33);
		man.setBirthday(LocalDate.of(2025, 6, 7));
		// "제 이름은 최한석이고 나이는 33살, 그리고 생일은 2025년 6월 7일입니다."
		
		man.sing();
		man.eat();
		man.run();
	}
}

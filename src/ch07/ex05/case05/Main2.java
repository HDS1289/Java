package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<Cat> floor1 = new ArrayList<>();
		List<Cat> floor2 = new ArrayList<>();
		List<List<Cat>> house = new ArrayList<>();
			
		for(int i = 0; i < 3; i++) {
			floor1.add(new Cat("고양이" + i));
			floor2.add(new Cat("야옹이" + i));
		}
		System.out.printf("%s\n%s\n", floor1, floor2);
		System.out.println();
		
		house.add(floor1);
		house.add(floor2);
		
		System.out.println(house);
		
		//hw ==> 각 층의 고양이들에게 먹이를 주려면??
		
//		for(Cat cat: floor1) cat.eat();
//		for(Cat cat: floor2) cat.eat();
		
		// ==> 한 층의 고양이들에게 밥을 먼저 주고 다른 층의 고양이들에게 밥을 나중에 주시려고??
		
		for(List<Cat> floor: house)
			for(Cat cat: floor) cat.eat();
	}
}

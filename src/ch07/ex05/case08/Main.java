package ch07.ex05.case08;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 동물을 우리에 집어넣고 iterating을 한다??
		Lion lion = new Lion();
		Leopard leopard = new Leopard();
		Dove dove = new Dove();
		Duck duck = new Duck();
		
		List<Creeper> pen = new ArrayList<>();
		pen.add(lion);
		pen.add(leopard);
//		pen.add(dove);
		
		List<Bird> cage = new ArrayList<>();
		cage.add(dove);
		cage.add(duck);
//		cage.add(lion);
		
		for(Creeper creeper: pen) creeper.walk();
		
		for(Bird bird: cage) bird.fly();
	}
}

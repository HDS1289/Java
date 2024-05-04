package ch07.home.ex05.case10;
/*
 * 가방에 연필과 지우개를 담는다.
 * 가방에서 물건을 꺼낸다.
 * 꺼낸 물건이 연필이면 write, 지우개면 erase하라.
 */
public class Main {
	public static void main(String[] args) {
		Bag<Stationery> bag = new Bag<>();
		Pencil pencil = new Pencil();
		Eraser eraser = new Eraser();
		
		bag.add(pencil);
		bag.add(eraser);
		
		for(Stationery stationery: bag) {
			if(stationery instanceof Pencil pen) pen.write();
			if(stationery instanceof Eraser rubber) rubber.erase();
		}
		
	}
}

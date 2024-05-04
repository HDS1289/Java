package ch07.ex05.case10;

public class Bumblebee implements AutoBot {
	@Override
	public void run() {
		System.out.println("범블비가 달린다.");
	}
	
	@Override
	public void fight() {
		System.out.println("범블비가 싸운다.");
	}
	
	public void guard() {
		System.out.println("범블비가 보호한다.");
	}
}

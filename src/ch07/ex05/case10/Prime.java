package ch07.ex05.case10;

public class Prime implements AutoBot {
	@Override
	public void run() {
		System.out.println("프라임이 달린다.");
	}
	
	@Override
	public void fight() {
		System.out.println("프라임이 싸운다.");
	}
	
	public void command() {
		System.out.println("프라임이 지휘한다.");
	}
}

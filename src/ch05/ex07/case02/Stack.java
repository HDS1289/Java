package ch05.ex07.case02;

import ch05.ex06.case02.Console;

public class Stack {
	public static void first() { // stack에서 method가 시작할 때 메시지를 출력하고 method가 끝날 때 method가 출력하게 한다.
		Console.info("first() start.");
		
		int a = 0;
		Stack.second();
		
		Console.info("first() end");
	}
	
	public static void second() {
		Console.info("second() start.");
		
		int a = 0;
		
		Console.info("second() end.");
	}
}

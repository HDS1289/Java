package ch07.ex04.case05;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static int inNum(String msg) {
		boolean isGood = false;
		String tmp = "";
		int num = 0;
		do {
			isGood = false;
			Console.inMsg(msg);
			tmp = sc.nextLine();
			isGood = tmp.matches("[0-9]+");
			if(!isGood) Console.err("숫자가 아닙니다.");
			else num = Integer.parseInt(tmp);
		} while(!isGood);
		
		return num;
	}
	
	public static String inStr(String msg) {
		boolean isGood = false;
		String input = "";
		do {
			isGood = false;
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[a-zA-Z가-힣]+");
			if(!isGood) Console.err("문자가 아닙니다.");
		} while(!isGood);
		
		return input;
	}
	
	private static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
	
	public static void info(Object obj) {
		System.out.println(obj);
	}
}

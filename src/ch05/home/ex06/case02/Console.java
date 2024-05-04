package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static String inStr(String msg) {
		String input = "";
		boolean isGood = false;
		do {
			isGood = false;
			Console.inMsg(msg + "를 입력하세요.");
			input = sc.nextLine();
			isGood = input.matches("[a-zA-Z가-힣]+");
			if(!isGood) Console.err(msg + "가 아닙니다.");
		} while(!isGood);
		
		return input;
	}
	
	public static int inNum(String msg) {
		String tmp = "";
		int num = 0;
		boolean isGood = false;
		do {
			isGood = false;
			Console.inMsg(msg + "를 입력하세요.");
			tmp = sc.nextLine();
			isGood = tmp.matches("^[1-9][0-9]*"); // 자연수는 0으로 시작할 수 없다.
			if(!isGood) Console.err(msg + "가 아닙니다.");
			else num = Integer.parseInt(tmp);
		} while(!isGood);
		
		return num;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR]" + msg);
	}
}

package ch05.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static { // static 초기화 블록
		sc = new Scanner(System.in);
	} // byte code가 로딩된 후에 바로 실행된다.
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static String inStr(String msg) {
		Console.inMsg(msg);
		return sc.nextLine().trim();
	}
	
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR]" + msg);
	}
}

package ch04.home.ex04;

import java.util.Scanner;

public class CaculatorAnother2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result = 0;
		String op = "";
		String tmp = "";
		String errMsg = "input 0 or natural number.";
		String calRetrn = ""; // 처음으로 돌아가게 하는 기능이다.
		boolean isGood = false;
		
		do {
			do {
				isGood = false;
				System.out.print("a: ");
				tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+");
				if(isGood) a = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("op: ");
				op = sc.nextLine();
				isGood = op.matches("[+-/\\*]");
				if(!isGood) System.out.println("input one of them (+ - * /)");
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("b: ");
				tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+");
				if(isGood) b = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			result = switch(op) {
			case "+" -> a + b;
			case "-" -> a - b;
			case "*" -> a * b;
			default -> a / b;
			};
			System.out.printf("%d %s %d = %d\n", a, op, b, result);
			System.out.print("continue(y/n)? ");
			calRetrn = sc.nextLine();
			if(!calRetrn.equalsIgnoreCase("N") && !calRetrn.equalsIgnoreCase("Y"))
				System.out.println("input one of them ==> Y(y) or N(n)");
		} while(calRetrn.equalsIgnoreCase("Y") || !calRetrn.equalsIgnoreCase("N"));
		
		System.out.println("The End.");
	}
}

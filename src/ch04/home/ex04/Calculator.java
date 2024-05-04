package ch04.home.ex04;
/*
 * 계산기를 만들자 ==> 예외 처리가 가능한 계산기이다
 * 가감승제의 기능만 있다. ( + - * / )
 * 주요 변수 ==> a, b, op
 * 0 또는 자연수만 입력받을 수 있다.
 * 나눗셈은 몫만을 출력할 수 있다.
 * continue(y/Y)에서 y(Y)를 입력한 경우 a 와 b를 다시 입력받는다.
 * Y 또는 y외의 것을 입력한 경우 프로그램이 종료된다.
 */

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp = "";
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		String calReturn = "";
		String op = "";
		String  errMsg = "ERROR] 0 또는 자연수만 입력 가능합니다.";
		boolean isGood = false;
		
		do {
			do {
				isGood = false;
				System.out.print("a: ");
				tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+"); // 한 개 이상이라도 0~9의 자연수가 들어가 있다면 정수형으로 바꿔라.
				if (isGood) num1 = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("op: ");
				op = sc.nextLine();
				isGood = op.matches("[+-/\\*]");
				if (isGood) break;
				else System.out.println("연산자는 +, -, *, /만 가능합니다.");
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("b: ");
				tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+");
				if (isGood) num2 = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			result = switch(op) {
			case "+" -> num1 + num2;
			case "-" -> num1 - num2;
			case "*" -> num1 * num2;
			default -> num1 / num2;
			};
			
			System.out.printf("%d %s %d = %d\n", num1, op, num2, result);		
			System.out.print("continue(Y/N)? ");
			calReturn = sc.nextLine();
		} while(calReturn.equalsIgnoreCase("Y")); // 입력받은 것이 y나 Y일 경우 반복문을 계속 수행한다.
		System.out.println("THE END");
	}
}

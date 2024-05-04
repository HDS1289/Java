package ch04.home.ex04;
/*
 * 계산기
 * a, op, b라는 변수를 가진다.
 * a, b는 입력값이 0또는 자연수여야 한다.
 * op는 연산자이다 => '+ - * \\/'만 가능하다.
 * 나눗셈은 몫만을 출력한다.
 * 계산 작업이 끝난 후에는 계속할 거냐는 질문을 던진다.
 * continue(y/n)?에서 y또는 Y를 입력할 경우 계산 작업이 반복된다.
 * 그 외의 것을 누르면 프로그램이 종료된다.
 */

import java.util.Scanner;

public class CalculatorAnother {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result = 0;
		String op = "";
		String input = "";
		String errMsg = "input 0 or natural number";
		String calReturn = "";
		boolean isGood = false;
		
		do {
			do {
				isGood = false; // flag variable이다. 반복문에서의 초기값이 지정된다.
				System.out.print("a: ");
				input = sc.nextLine();
				isGood = input.matches("[0-9]+"); // isGood라는 변수에 대입하여 참인지 거짓인지를 판별한다.
				if (isGood) a = Integer.parseInt(input);
				else System.out.println(errMsg);
			} while(!isGood); // 반복문을 빠져나갈 수 없게 하는 조건 ==> 입력값이 참일 때 반복문을 빠져 나갈 수 있다.
				
			do {
				isGood = false;
				System.out.print("op: ");
				op = sc.nextLine();
				isGood = op.matches("[+-/\\*]");
				if (!isGood) System.out.println("input one of them(+ - * /)"); 
			} while(!isGood);
				
			do {
				isGood = false;
				System.out.print("b: ");
				input = sc.nextLine();
				isGood = input.matches("[0-9]+");
				if (isGood) b = Integer.parseInt(input);
				else System.out.println(errMsg);
			} while(!isGood);
			
			result = switch(op) {
			case "+" -> a + b;
			case "-" -> a - b;
			case "*" -> a * b;
			default -> a / b;
			};
			
			System.out.printf("%d %s %d = %d\n", a, op, b, result);
			System.out.print("continue(Y/N)? ");
			calReturn = sc.nextLine();
			if (!calReturn.equalsIgnoreCase("Y") && !calReturn.equalsIgnoreCase("N"))
				System.out.println("input Y(y) or N(n)");
		} while(!calReturn.equalsIgnoreCase("N") || calReturn.equalsIgnoreCase("Y"));
		// N이나 n을 입력하는 순간 반복문을 탈출하게 한다.
		System.out.println("The End");
	}
}

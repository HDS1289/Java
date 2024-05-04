package Pr;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int account = 0;
		int deposit = 0;
		int withdraw = 0;
		boolean isGood = false;
		while (!isGood) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			choice = sc.nextInt();
			isGood = (choice == 4);
			if (!isGood) {
				switch (choice) {
					case 1 -> {
						System.out.print("예금액> ");
						deposit = sc.nextInt();
						account += deposit;
					}
					case 2 -> {
						System.out.print("출금액> ");
						withdraw = sc.nextInt();
						account -= withdraw;
					}
					case 3 -> {
						System.out.print("잔고> ");
						System.out.println(account);
					}
					default -> System.out.println("1, 2, 3, 4 중에서 선택하세요.");
				}
			} else break;
		}
		System.out.println("프로그램 종료.");
	}
}

package ch05.ex01.case4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		String userName = "";
		int age = 0;
		
		System.out.print("이름: ");
		userName = sc.nextLine();
		
		user.setUserName(userName);

		
		System.out.printf("%s\n", user.getUserName());
		
	}
}

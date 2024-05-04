package ch05.home.ex02.case01;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isGood = false;
		String userName = "";
		String age = "";
		int userAge = 0;
		do {
			isGood = false;
			System.out.print("이름: ");
			userName = sc.nextLine();
			isGood = userName.matches("[a-zA-Z가-힣]+");
			if(!isGood || userName == "") System.out.println("ERROR] 문자를 입력하세요.(특수문자 제외)");
		} while(!isGood);
		
		do {
			isGood = false;
			System.out.print("나이: ");
			age = sc.nextLine();
			isGood = age.matches("[0-9]+");
			if(!isGood || age == "") System.out.println("ERROR] 숫자를 입력하세요.");
			else userAge = Integer.parseInt(age);
		} while(!isGood);
		
		User user = new User();
		
		
		user.setUserName(userName); user.setUserAge(userAge); user.setRegDate(LocalDate.now());
		
		System.out.printf("\n이름: %s\n나이: %d\n가입일: %s", user.getUserName(), user.getUserAge(), user.getRegDate());
		
	}
}

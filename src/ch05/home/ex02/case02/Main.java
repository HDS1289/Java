package ch05.home.ex02.case02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Paper paper = new Paper();
		String msg = "";
		String writerName = "";
		String errMsg = "ERROR] 문자를 입력하세요.(숫자, 특수문자 제외)";
		boolean isGood = false;
		
		do {
			isGood = false;
			System.out.print("메시지: "); // 메시지와 작성자명은 문자열 타입이어야 하는데???
			msg = sc.nextLine(); //  어떻게 해야지 거를 수 있을까? (숫자나 특수기호 등이 오지 않게 하는 법?)
			isGood = msg.matches("[a-zA-Z가-힣]+");
			if(isGood) paper.setMsg(msg);
			else System.out.println(errMsg);
		} while(!isGood);
			
		do {
			isGood = false;
			System.out.print("작성자명: ");
			writerName = sc.nextLine();
			isGood = writerName.matches("[a-zA-Z가-힣]+");
			if(isGood) paper.setWriterName(writerName);
			else System.out.println(errMsg);
		} while(!isGood);
		
		System.out.printf("\n%s from %s.\n", paper.getMsg(), paper.getWriterName());
	}
}

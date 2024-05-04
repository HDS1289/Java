package ch05.ex02.case02;
// 보드에다 메시지와 작성일자를 적어라.

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Board board = new Board();
		
		board.setMsg("좋은 하루 되세요.");
		board.setWrittenDate(LocalDate.now());
		
		System.out.printf("%s, %s\n", board.getMsg(), board.getWrittenDate());
		
		board.setMsg("이번 주말에는 다함께 야구 경기 직관을 갑니다.");
		board.setWrittenDate(LocalDate.of(2024, 4, 27));
		System.out.printf("%s, %s\n", board.getMsg(), board.getWrittenDate());
	}
}

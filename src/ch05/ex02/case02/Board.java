package ch05.ex02.case02;

import java.time.LocalDate;

public class Board { // 칠판에는 메시지와 작성일이 담겨 있다.
	private String msg;
	private LocalDate writtenDate;
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public LocalDate getWrittenDate() {
		return writtenDate;
	}
	
	public void setWrittenDate(LocalDate writtenDate) {
		this.writtenDate = writtenDate;
	}
}

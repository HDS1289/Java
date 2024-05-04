package ch05.home.ex02.case02;

public class Paper { // 종이에는 메시지와 그 메시지를 작성한 사람의 이름을 담을 수 있다.
	private String msg;
	private String writerName;
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public String getWriterName() {
		return writerName;
	}
}
// 스프링 단계에서는 바이트 코드상으로만 getter와 setter가 존재하게 할 수 있다.
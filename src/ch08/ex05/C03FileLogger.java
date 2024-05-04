package ch08.ex05;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class C03FileLogger {
	private Logger logger;
	
	public C03FileLogger() {
		this.logger = Logger.getLogger(this.getClass().getName());
		System.out.println(this.getClass().getName());
	}
	
	/*
	 * FileHandler형태로 객체를 생성하면 
	 * 메시지를 xml형태로 출력한다.
	 * 
	 * logger에서 출력한 메시지는
	 * handler객체로 들어간다.
	 * 메시지들은 메모리 공간 안에 기록된다.
	 */
	public void log() throws Exception {
		Handler handler = new FileHandler("c:/DEV/ch08.ex05.xml");
		logger.addHandler(handler);
		
		logger.info("로깅을 시작합니다.");
		logger.severe("예외가 발생했습니다.");
		logger.info("로깅이 끝났습니다.");
		
		handler.flush(); // handler객체가 갖고 있는 것을 파일로 쏟아낸다.
		handler.close();
	}
	// 원래는 try블록으로 묶어야 한다.
	public static void main(String[] args) throws Exception { // 내가 처리하지 않겠다 ==> JVM이 처리하게 한다.(JVM에게 떠넘기게 한다.)
		new C03FileLogger().log();
	}
}

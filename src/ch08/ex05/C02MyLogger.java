package ch08.ex05;

import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * getLogger 메소드에서는 로그 객체의 이름을 지정한다.
 * 패키지 이름으로 정함으로써 중복을 피할 수 있다.
 */
public class C02MyLogger {
	private Logger logger;
	
	public C02MyLogger() {
		this.logger = Logger.getLogger("ch08.ex05"); 
	}
	
	public void log() {
		logger.info("로깅을 시작합니다.");
		
		try {
			throw new Exception("일부러 예외를 만들었습니다.");
		} catch(Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
		
		logger.info("로깅을 끝냅니다.");
	}
	
	public static void main(String[] args) {
		new C02MyLogger().log();
	}
}

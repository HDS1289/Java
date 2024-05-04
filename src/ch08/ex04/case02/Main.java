package ch08.ex04.case02;
/*
 * Exception type이 Exception객체이면
 * try블록은 필수적으로 써야 한다.
 * 
 * 그러나 Exception type이 RuntimeException이면
 * try블록으로 묶지 않아도 된다.
 */
public class Main {
	public static void main(String[] args) {
		String userId = "gambit";
		
		try {
			if(userId.length() > 3)
				throw new LengthException("문자 길이가 초과되었습니다.");
		} catch(LengthException e) {
			e.printStackTrace();
		}
		
		throw new NumberException("숫자가 아닙니다.");
	}
}

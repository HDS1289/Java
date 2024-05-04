package pr3;

public class MemberService {
	private String memberPw;
	private String memberId;
	
	public boolean login(String memberId, String memberPw) {
		boolean isValid = false;
		if(memberId == "hong" && memberPw == "12345")
			isValid = true;
		else isValid = false;
		
		return isValid;
	}
	
	public void logout(String memberId) {
		System.out.println(memberId + "님이 로그아웃 되었습니다.");
	}
}

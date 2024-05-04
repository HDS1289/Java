package pr3;

public class Member {
	private String memberName;
	private String memberId;
	private String memberPw;
	private int age;
	
	public Member(String memberName, String memberId) {
		this.memberName = memberName;
		this.memberId = memberId;
	}
	
	public Member(String memberName, String memberId, String memberPw, int age) {
		this.memberName = memberName;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.age = age;
	}
}

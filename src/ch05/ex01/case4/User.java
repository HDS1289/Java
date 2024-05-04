package ch05.ex01.case4;

public class User {
	private String userName;
	private int age;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		char familyName = userName.charAt(0);
		
		if(familyName == '한') this.userName = userName;
		else this.userName = "없는 사람";
	}
	
}

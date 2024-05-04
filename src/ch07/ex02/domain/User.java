package ch07.ex02.domain;

public class User {
	private String userName;
	
	public User(String userName) {
		this.userName = userName;
	}
	
//	public void setUser(String userName) {
//		this.userName = userName;
//	}
//	
//	public String getUser() {
//		return this.userName;
//	}
	
	@Override
	public String toString() {
		return this.userName;
	}
}

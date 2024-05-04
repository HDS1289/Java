package ch08.ex02.case05;

public class User {
	private String userName;
	private Level level;
	
	public User(String userName, Level level) {
		this.userName = userName;
		this.level = level;
	}
	
	public void upgradeLevel() {
		Level nextlevel = level.next();
		if(nextlevel != null) this.level = nextlevel;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", userName, level);
	}
}
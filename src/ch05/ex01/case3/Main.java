package ch05.ex01.case3;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		
		// user.userName 캡슐화되어 있어서 접근하지 못한다.
		user.setUserName("최한석");
		user.setAge(25);
		
		user.setUserName("한아름");
		user.setAge(34);
		
		System.out.printf("%s, %d\n", user.getUserName(), user.getAge());
	}
}

package ch07.ex01.case06;

public class Main {
	public static void main(String[] args) {
		Human human = new Student();
		
		human.sleep();
		
//		human.study(); 공부하는 속성은 가지지를 않는다.
		
		Student student = (Student)human;
		
		student.study();
		student.sleep();
	}
}

package ch06.ex05.case02;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog(1);
		
		dog.shout();
		System.out.printf("%d", dog.getAge()); // getter에서의 this가 가리키는 datatype인 Animal 클래스에서의 age를 사용한 것이다.
	}
}

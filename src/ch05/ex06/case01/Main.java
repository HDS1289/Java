package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love Java."); // static method ==> 객체 생성 과정을 거치지 않는다.
		
		Man.say("I hate python.");
		
		Man man = new Man(); // instance ==> 객체 인스턴스를 생성한다.
		
		man.tell("I wanna be alive."); // instance method ==> 객체 생성이 필요하다.
	}
}

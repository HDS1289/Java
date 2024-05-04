package ch07.ex08.case05;

public class Main {
	public static void main(String[] args) {
		LamdaDog lamdadog1 = Dog::print; // static method의 경우에는 method reference expression을 사용할 수 있다.
		LamdaDog lamdadog2 = (dogName, age) -> {
			System.out.printf("우리집 개 %s는 %d살 입니다.\n", dogName, age);
		};
		
		lamdadog1.print("walwal", 2);
		lamdadog2.print("콩콩이", 3);
	}
}

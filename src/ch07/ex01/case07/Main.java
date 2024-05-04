package ch07.ex01.case07;

public class Main {
	public static void main(String[] args) {
		Human human = new Human();
		Kimchi kimchi = new Kimchi();
		Ramen ramen = new Ramen();
		
		human.eat(kimchi); // eat가 실행하는 시점에서는 food type으로 promotion이 실행된 것이다.
		human.eat(ramen); // toString을 호출하게 된다.
		human.eat(new Apple()); // type이 달라도 자신의 성격을 계속 유지한다.
	}
}

package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		Phone phone = new Phone();
		
		phone.setPhoneMaker("삼성");
		phone.setPrice(1_000_000);
		
		person.setPhone(phone); // person has a phone ==> dependency
		
		person.sendMessage();
		person.call();
		person.playGame();
	}
}

package ch05.ex09.case02;

public class Main {
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone(3000);
		Phone phone4 = new Phone();
		
		System.out.printf("%s\n%s\n%s\n%s\n", 
				phone1.getSerial(),
				phone2.getSerial(),
				phone3.getSerial(),
				phone4.getSerial());
	}
}

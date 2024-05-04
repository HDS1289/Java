package ch04.ex01;

public class C03If {
	public static void main(String[] args) {
		int hour = 17;
		
		if (hour < 12) { // 출력문만 반복된다.
			System.out.println("Good morning.");
		} else if (hour < 18) {
			System.out.println("Good afternoon.");
		} else if (hour < 21) {
			System.out.println("Good evening.");
		} else 
			System.out.println("Good night.");
		
		hour = 20;
		String greet = "";
		if (hour < 12) greet = "Good morning.";
		else if (hour < 18) greet = "Good afternoon";
		else if (hour < 21) greet = "Good evening";
		else greet = "Good night.";
		System.out.println(greet);
	}
}

package ch07.ex08.case05;

public record Dog(String dogName, int age) {
	public static void print(String dogName, int age) {
		System.out.printf("My dog %s is %d years old.\n", dogName, age);
	}
}

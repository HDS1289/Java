package ch06.home.ex04.case03;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(new Point(1, 2), 3); // circle has a point(dependency)
		
		System.out.println(circle);
	}
}

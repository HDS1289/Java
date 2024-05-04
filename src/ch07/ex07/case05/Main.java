package ch07.ex07.case05;

public class Main {
	public static void main(String[] args) {
		Janitor<Car> janitor1 = (car) -> System.out.println(car + " 청소하다.");
		Janitor<Building> janitor2 = (building) -> System.out.println(building + " 청소하다.");
		
		janitor1.clean(new Car());
		janitor2.clean(new Building());
	}
}
